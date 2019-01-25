package com.mycompany.imagej;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestGaussFiltering {
	
	@Test
	public void testGaussFiltering() {
		GaussFiltering plugin = new GaussFiltering<>();
		assertNotNull("Plugin not initialized", plugin);
	}
}