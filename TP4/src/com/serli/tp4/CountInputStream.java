package com.serli.tp4;

import java.io.IOException;
import java.io.InputStream;

public class CountInputStream {
	public static final byte[] readBytes(InputStream in, int maxBytes) throws IOException {
		byte[] result = new byte[maxBytes];
		int bytesRead = in.read(result);
		if (bytesRead > maxBytes) {
			throw new IOException("Reached max bytes (" + maxBytes + ")");
		}
		if (bytesRead < 0) {
			result = new byte[0];
		} else {
			byte[] tmp = new byte[bytesRead];
			System.arraycopy(result, 0, tmp, 0, bytesRead);
			result = tmp;
		}
		return result;
	}
}
