package com.stackroute.buzzup.recommendation.services;
import com.stackroute.buzzup.recommendation.domain.Language;

public interface LanguageService {
	public Language findBylanguageName(String languageName);
}
