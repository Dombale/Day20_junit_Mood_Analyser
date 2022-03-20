package com.Day20_MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	@Test
	public void givenMessage_SadMood_ShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyseMood("I am in Sad Mood");
		Assert.assertEquals("SAD", mood);
	}
}
