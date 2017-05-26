package com.abassi.team4A;
 
import java.io.*;

import org.wiztools.xsdgen.XsdGen;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XmlSchemaGen {
	private String XsdString;
	private String FString;

	public XmlSchemaGen() {
		XsdString = "";
		FString = "";
	}

	public XmlSchemaGen(File fl) {
		try {
			XsdString = "";
			FString = "";
			this.parseXmlFile(fl);
		}
		catch(Exception e) {
			e.getMessage();
		}
	}

	public String getRawXsd() {
		return XsdString;
	}

	public String getFormatString() {
		return FString;
	}

	public void writeFile(String flstr) throws Exception {
		File fl = new File(flstr);
		FileWriter output = new FileWriter(fl);
		try {
			output.write(FString);
			output.flush();
			output.close();
		} catch (Exception exc) {
			System.err.println(exc.getMessage());
		}
	}

	public void printXsdFormat() {
		System.out.println(FString);
	}

	public void writeXsd(String FileName) throws IOException {
		File writeFile = new File(FileName);

		if(!writeFile.exists()) {
			writeFile.createNewFile();
		}

		FileWriter write = new FileWriter(writeFile, false);

		write.write(FString);
		write.close();



	}

	private void parseXmlFile(File fl) throws Exception {
		XsdString = new XsdGen().parse(fl).toString();
		try {
			FString = formatXSD(XsdString);
		} catch (Exception exc) {
			System.err.println(exc.getMessage());
		}
	}

	private String formatXSD(String xsdString) {
		try {

			Source xmlInput = new StreamSource(new StringReader(xsdString));
			StringWriter stringWriter = new StringWriter();
			StreamResult xmlOutput = new StreamResult(stringWriter);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			transformerFactory.setAttribute("indent-number", 2);
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(xmlInput, xmlOutput);

			return xmlOutput.getWriter().toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
