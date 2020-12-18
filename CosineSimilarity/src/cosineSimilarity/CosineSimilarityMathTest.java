package cosineSimilarity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CosineSimilarityMathTest {

	@Test
	void helloWorld() {
		String v1Text = "hello world";
		String v2Text = "my name is tenace hello world";
		double cosineSimilarity = 0.577;
		CosineSimilarityMath c = new CosineSimilarityMath();
		String vectorOne = v1Text;
		String vectorTwo = v2Text;
		c.vectorOneSplit(vectorOne);
		c.vectorTwoSplit(vectorTwo);
		c.combineVectorWords(c.vectorOneWords, c.vectorTwoWords);
		c.vectorOneWC(c.combineVectorWords(c.vectorOneWords, c.vectorTwoWords), c.vectorOneWords);
		c.vectorTwoWC(c.combineVectorWords(c.vectorOneWords, c.vectorTwoWords), c.vectorTwoWords);
		assertEquals(cosineSimilarity,c.cosineSimilarity(c.vectorOneWC, c.vectorTwoWC));
	}

}
