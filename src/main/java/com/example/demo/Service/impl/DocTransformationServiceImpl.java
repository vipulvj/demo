/**
 * 
 */
package com.example.demo.Service.impl;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.example.demo.Service.TransformationService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.itextpdf.text.DocumentException;

/**
 * @author vipul.joshi
 *
 */
@Service
public class DocTransformationServiceImpl implements TransformationService {

	@Override
	public void transform(String data, String path)
			throws JsonParseException, JsonMappingException, IOException, DocumentException {
		// TODO Auto-generated method stub

	}

}
