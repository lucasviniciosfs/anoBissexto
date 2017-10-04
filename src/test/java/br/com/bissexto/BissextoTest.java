package br.com.bissexto;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BissextoTest {
    
	@Test
	public void main(){
		
		Bissexto ano = new Bissexto();
		
		Assert.assertEquals(true, ano.anoBissexto(2000));
		Assert.assertEquals(true, ano.anoBissexto(380));
		Assert.assertEquals(true, ano.anoBissexto(28));
		Assert.assertEquals(false, ano.anoBissexto(2017));
	}
}
