package com.example.sample.app.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.util.List;

public class CsvUtil {

	private final static CsvMapper mapper = new CsvMapper();
	private CsvUtil() {
		// static class のため、インスタンス化を禁止します.
	}

	public static <T> String toString(List<T> vo, Class<T> clazz) throws JsonProcessingException {
		CsvSchema schema = mapper.schemaFor(clazz).withHeader();
		return mapper.writer(schema).writeValueAsString(vo);
	}

	public static <T> byte[] toBytes(List<T> vo, Class<T> clazz) throws JsonProcessingException {
		CsvSchema schema = mapper.schemaFor(clazz).withHeader();
		return mapper.writer(schema).writeValueAsBytes(vo);
	}
}
