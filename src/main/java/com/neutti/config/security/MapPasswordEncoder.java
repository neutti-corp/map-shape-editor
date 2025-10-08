package com.neutti.config.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Repository
public class MapPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        StringBuilder builder = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.reset();
            md.update("SUNDO_LEIS".getBytes());
            byte[] mb = md.digest(charSequence.toString().getBytes(StandardCharsets.UTF_8));
            for (byte b: mb) {
                builder.append(String.format("%02x", b));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }

    @Override
    public boolean matches(CharSequence raw, String encoded) {
        String rawEncode = encode(raw);
        return encoded.equals(rawEncode);
    }
}
