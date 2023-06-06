package com.urlshortner.service.Impl;

import java.nio.charset.Charset;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.hash.Hashing;
import com.urlshortner.entity.Url;
import com.urlshortner.repository.UrlRepository;
import com.urlshortner.service.UrlService;

@Service
public class UrlServiceImpl implements UrlService {

	@Autowired
	private UrlRepository repository;

	@Override
	public Url generateShortLink(Url url) {

		String encodedUrl = encodeUrl(url.getOriginalUrl());
		Url urlToPersist = new Url();
		urlToPersist.setCreationDate(LocalDateTime.now());
		urlToPersist.setOriginalUrl(url.getOriginalUrl());
		urlToPersist.setShortLink(encodedUrl);
		urlToPersist.setExpirationDate(LocalDateTime.now().plusMinutes(5));

		return repository.save(urlToPersist);

	}

	private String encodeUrl(String url) {
		String encodedUrl = "";
		LocalDateTime time = LocalDateTime.now();
		encodedUrl = Hashing.murmur3_32().hashString(url.concat(time.toString()), Charset.defaultCharset()).toString();
		return encodedUrl;
	}

	@Override
	public Url getEncodedUrl(String url) {

		return repository.findByShortLink(url);

	}

	

}
