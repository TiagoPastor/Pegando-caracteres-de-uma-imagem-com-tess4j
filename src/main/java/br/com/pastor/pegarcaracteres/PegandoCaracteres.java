package br.com.pastor.pegarcaracteres;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class PegandoCaracteres {
	
	/** Para poder usar o Tess4j importa as dependências baixando no link 
	 * http://tess4j.sourceforge.net/ depois descompacta a pasta tessdata na raiz do projeto 
	 */

	public static void main(String[] args) {

		File imageFile = new File("exemplos-de-textos.jpg");
        Tesseract instance = new Tesseract();
        instance.setLanguage("por"); // define o idioma da leitura 
        /**
         * Caso precise ler outros idiomas, 
         *  deve baixar o arquivo do idioma em questão no link https://github.com/tesseract-ocr, 
         * descompactar o arquivo dentro da pasta tessdata, e definir em seu código o idioma correspondente.
         */
         
        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }

	}

}
