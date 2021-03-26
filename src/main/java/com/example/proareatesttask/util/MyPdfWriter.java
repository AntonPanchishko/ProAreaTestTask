package com.example.proareatesttask.util;

import com.example.proareatesttask.model.Product;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class MyPdfWriter {
    public void write(List<Product> product) {
        Document document = new Document();
        try {
            com.itextpdf.text.pdf.PdfWriter.getInstance(document,
                    new FileOutputStream("checkFile.pdf"));
            document.open();
            Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);

            List<Chunk> check = createCheck(product, font);
            for (Chunk chunk : check) {
                document.add(chunk);
                document.add(new Paragraph("\n"));
            }
        } catch (DocumentException | FileNotFoundException e) {
            throw new RuntimeException("Can't find file", e);
        } finally {
            document.close();
        }
    }

    private List<Chunk> createCheck(List<Product> list, Font font) {
        List<Chunk> chunks = new ArrayList<>();
        long finalSum = 0;
        for (Product product : list) {
            finalSum = finalSum + product.getPrice();
            String currentCheck = product.getProductName()
                    + " " + product.getPrice();
            chunks.add(new Chunk(currentCheck, font));
        }
        chunks.add(new Chunk("Order sum = " + finalSum, font));
        return chunks;
    }
}
