/**
 * 
 */
package com.example.demo.Service;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.itextpdf.text.DocumentException;

/**
 * @author vipul.joshi
 *
 */
public interface TransformationService {

	public void transform(String data, String path) throws JsonParseException, JsonMappingException, IOException, DocumentException;
}
