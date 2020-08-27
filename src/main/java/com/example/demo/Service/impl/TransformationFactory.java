/**
 * 
 */
package com.example.demo.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Service.TransformationService;

/**
 * @author vipul.joshi
 *
 */
public class TransformationFactory {
	@Autowired
	private PDFTransformationServiceImpl pdfService;

	@Autowired
	private DocTransformationServiceImpl docService;

	public TransformationService getFactory(String format) {
		if ("PDF".equalsIgnoreCase(format)) {
			return pdfService;
		} else if ("DOC".equalsIgnoreCase(format)) {
			return docService;
		}
		return null;
	}
}
