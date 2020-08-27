/**
 * 
 */
package com.example.demo.Service.impl;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.example.demo.Service.TransformationService;
import com.example.demo.Vo.DemoVo;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @author vipul.joshi
 *
 */
@Service
public class PDFTransformationServiceImpl implements TransformationService {

	@Override
	public void transform(String jsonString, String path)
			throws JsonParseException, JsonMappingException, IOException, DocumentException {
		// TODO Auto-generated method stub
		DemoVo demoVo = new ObjectMapper().readValue(jsonString, DemoVo.class);
		Document document = new Document();
		addMetaData(document);
		PdfWriter.getInstance(document, new FileOutputStream(path + "\\sample-demo.pdf"));

		document.open();
		Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
		// There are many properties try them out
		Chunk name = new Chunk(demoVo.getName(), font);
		document.add(name);
		Chunk address = new Chunk(demoVo.getAddress(), font);
		document.add(address);
		Chunk nationality = new Chunk(demoVo.getNationality(), font);
		document.add(nationality);
		document.close();
	}

	private static void addMetaData(Document document) {
		document.addTitle("Personal Report");
		document.addAuthor("Demo");
		document.addCreator("Demo");
	}

}
