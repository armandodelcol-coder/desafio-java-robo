package br.com.demo.recruiting.blocks;

import org.junit.Assert;
import org.junit.Test;

public class BlocksTest {

    @Test
    public void shouldReturnZeroInAllPositionsIfCommandIsOnlyP() {
    	Blocks blocks = new Blocks();
    	Assert.assertEquals("0000000000", blocks.operate("P"));
    }
    
    @Test
    public void shouldReturnZeroInAllPositionsIfCommandIsOnlyM() {
    	Blocks blocks = new Blocks();
    	Assert.assertEquals("0000000000", blocks.operate("M"));
    }
    
    @Test
    public void shouldReturnZeroInAllPositionsIfCommandIsOnlyD() {
    	Blocks blocks = new Blocks();
    	Assert.assertEquals("0000000000", blocks.operate("D"));
    }
    
    @Test
    public void shouldReturnCorrectStackState() {
    	Blocks blocks = new Blocks();
    	Assert.assertEquals("0211000000", blocks.operate("PMDPMMMDPMDPMMD"));
    }
    
    @Test
    public void shouldReturn15BlocksInFirstPosition() {
    	Blocks blocks = new Blocks();
    	Assert.assertEquals("15000000000", blocks.operate("PDPDPDPDPDPDPDPDPDPDPDPDPDPDPDPDPDPDPDPD"));
    }
}
