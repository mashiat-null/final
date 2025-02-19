package question;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import java.awt.Desktop;
import static java.awt.SystemColor.text;
import java.io.BufferedReader;
import java.io.File;
import com.itextpdf.text.Document;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import org.apache.pdfbox.Loader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.PageSize;
import java.awt.Color;
import java.awt.Dimension;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.*;
import java.io.File;        // For File handling
import java.io.FileInputStream;
import java.util.logging.Level; // For logging
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; // For .xlsx files



public class  pdffile extends javax.swing.JFrame// error
{
  String getfilepath;
 private File saveFile;


    public pdffile() {
        initComponents();

        download.addActionListener(e -> {
       try {
            convertTextToPdf(saveFile);  
        } catch (DocumentException ex) {
            Logger.getLogger(pdffile.class.getName()).log(Level.SEVERE, null, ex);
        }
    
});

    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        filepath = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Open = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Generate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        download = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Elearning_education-scaled.jpg"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Elearning_education-scaled.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upload.setBackground(new java.awt.Color(125, 170, 191));
        upload.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        upload.setForeground(new java.awt.Color(255, 255, 255));
        upload.setText("UPLOAD");
        upload.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        upload.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        upload.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        getContentPane().add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 150, 40));

        filepath.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        filepath.setText("Excel Sheet ");
        filepath.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                filepathFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                filepathFocusLost(evt);
            }
        });
        getContentPane().add(filepath, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 455, 40));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("UNIQUE MCQ SET GENERATOR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 48));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("WELCOME TO ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Elearning_education-scaled_1.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 250));

        jPanel1.setBackground(new java.awt.Color(125, 170, 191));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OPEN THE EXCEL FILE");

        Open.setBackground(new java.awt.Color(125, 170, 191));
        Open.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        Open.setForeground(new java.awt.Color(255, 255, 255));
        Open.setText("OPEN");
        Open.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Open.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Open.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(Open, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(Open, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 460, 190));

        jPanel2.setBackground(new java.awt.Color(56, 90, 109));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("of Question ");

        Generate.setBackground(new java.awt.Color(56, 90, 109));
        Generate.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        Generate.setForeground(new java.awt.Color(255, 255, 255));
        Generate.setText("GENERATE");
        Generate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Generate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Generate.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Generate Unique Set");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(Generate, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(Generate)
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 500, 190));

        jPanel3.setBackground(new java.awt.Color(25, 47, 60));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Convert the  save file into PDF");

        download.setBackground(new java.awt.Color(25, 47, 60));
        download.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        download.setForeground(new java.awt.Color(255, 255, 255));
        download.setText("CONVERT");
        download.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        download.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        download.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(download, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(download)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 970, 130));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void filepathFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_filepathFocusGained
        // TODO add your handling code here:
         if( filepath.getText().equals("Excel Sheet ")){
            filepath.setText("");
       }
    }//GEN-LAST:event_filepathFocusGained

    private void filepathFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_filepathFocusLost
        // TODO add your handling code here:
         if(filepath.getText().equals("")){
             filepath.setText("Excel Sheet ");
        }

    }//GEN-LAST:event_filepathFocusLost

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        // TODO add your handling code here:
   JFileChooser jfc = new JFileChooser(); // Create a file chooser
    jfc.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Excel Files", "xlsx", "xls")); // Allow only Excel files
    
    int returnValue = jfc.showOpenDialog(this); // Open the file chooser dialog
    
    if (returnValue == JFileChooser.APPROVE_OPTION) { // Check if the user has selected a file
        try {
            File f = jfc.getSelectedFile(); // Get the selected file
            getfilepath = f.getAbsolutePath();
            getfilepath = getfilepath.replace('\\', '/'); // Replace backslashes with forward slashes (optional)
            filepath.setText(getfilepath); // Set the file path in a text field or wherever needed
            
            // Log the selected file path (optional)
            System.out.println("File selected: " + getfilepath);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage()); // Show error if any
        }
    } else {
        JOptionPane.showMessageDialog(rootPane, "No file selected."); // Notify if no file was selected
    }     
    }//GEN-LAST:event_uploadActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        // TODO add your handling code here:
         getfilepath = filepath.getText();
        try{
            File ExcelFile = new File(getfilepath);// representing the file at given path
            if(ExcelFile.exists()){
                if(Desktop.isDesktopSupported()){
                    Desktop.getDesktop().open(ExcelFile);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Desktop is not supported");
                }
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "File doesnot exist");

            }
        }catch(Exception e){

        }
        
        
    }//GEN-LAST:event_OpenActionPerformed

  // private File outputFile; // Declare a class-level variable to store the output file
 
   
    
    private void GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateActionPerformed
    if (getfilepath == null || !getfilepath.endsWith(".xlsx")) {
        JOptionPane.showMessageDialog(this, "Please upload a valid Excel file first.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (FileInputStream fis = new FileInputStream(getfilepath)) {
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        // Parse questions from the Excel sheet
        java.util.List<Question> questionsList = new java.util.ArrayList<>();
        for (Row row : sheet) {
            if (row.getRowNum() == 0) continue; // Skip header row

            String questionText = row.getCell(0).getStringCellValue();
            List<String> optionsList = new java.util.ArrayList<>();
            for (int i = 1; i <= 4; i++) {
            Cell cell = row.getCell(i);
          if (cell != null) {
        if (cell.getCellType() == CellType.STRING) {
            optionsList.add(cell.getStringCellValue());
        } else if (cell.getCellType() == CellType.NUMERIC) {
            optionsList.add(String.valueOf(cell.getNumericCellValue())); // Convert number to string
              }
           }
        }


            // Shuffle options and add to the questions list
            java.util.Collections.shuffle(optionsList);
            questionsList.add(new Question(questionText, optionsList));
        }

        workbook.close();

        // Get the number of sets and questions per set
        String setInput = JOptionPane.showInputDialog(this, "Enter the number of sets:");
        if (setInput == null || setInput.isEmpty()) return;
        int numSets = Integer.parseInt(setInput);

        String questionInput = JOptionPane.showInputDialog(this, "Enter the number of questions per set:");
        if (questionInput == null || questionInput.isEmpty()) return;
        int numQuestions = Integer.parseInt(questionInput);

        

        // Shuffle and create sets
    java.util.List<java.util.List<Question>> sets = new java.util.ArrayList<>();
    for (int i = 0; i < numSets; i++) {
        java.util.List<Question> set = new java.util.ArrayList<>();
        java.util.Set<Integer> usedIndexes = new java.util.HashSet<>();

        while (set.size() < numQuestions) {
            int randomIndex = (int) (Math.random() * questionsList.size());

            // Ensure no duplicate questions in the current set
            if (!usedIndexes.contains(randomIndex)) {
                usedIndexes.add(randomIndex);

                Question originalQuestion = questionsList.get(randomIndex);

                // Clone the question and reshuffle options
                List<String> shuffledOptions = new java.util.ArrayList<>(originalQuestion.getOptions());
                java.util.Collections.shuffle(shuffledOptions);

                set.add(new Question(originalQuestion.getText(), shuffledOptions));
            }
        }

        sets.add(set);
    }


        // Prepare result for display
        StringBuilder result = new StringBuilder("Generated Sets:\n");
        for (int i = 0; i < sets.size(); i++) {
            result.append("Set ").append(i + 1).append(":\n");
            java.util.List<Question> set = sets.get(i);
            for (int j = 0; j < set.size(); j++) {
                Question q = set.get(j);
                result.append("Q").append(j + 1).append(". ").append(q.getText()).append("\n");
                for (int k = 0; k < q.getOptions().size(); k++) {
                    result.append((char) ('a' + k)).append(". ").append(q.getOptions().get(k)).append("\n");
                }
                result.append("\n");
            }
            result.append("\n");
        }

        JTextArea textArea = new JTextArea(result.toString());
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(600, 400));
        int option = JOptionPane.showConfirmDialog(this, scrollPane, "Save Sets?", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            saveGeneratedSetsToFile(sets);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error while processing the Excel file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
 
    }//GEN-LAST:event_GenerateActionPerformed

    public class Question {
    private String text;
    private List<String> options;

    public Question(String text, List<String> options) {
        this.text = text;
        this.options = options;
    }

    public String getText() {
        return text;
    }

    public List<String> getOptions() {
        return options;
    }

    public void shuffleOptions() {
        Collections.shuffle(options);
    }
}
private void saveGeneratedSetsToFile(List<List<Question>> sets) {
     JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Save Generated Sets");
    int result = fileChooser.showSaveDialog(this);

    if (result == JFileChooser.APPROVE_OPTION) {
        saveFile = fileChooser.getSelectedFile();

        try (PrintWriter writer = new PrintWriter(new FileWriter(saveFile))) {
            for (int i = 0; i < sets.size(); i++) {
                writer.println("Set " + (i + 1) + ":");
                java.util.List<Question> set = sets.get(i);
                for (int j = 0; j < set.size(); j++) {
                    Question question = set.get(j);
                    writer.println("Q" + (j + 1) + ": " + question.getText());
                    for (int k = 0; k < question.getOptions().size(); k++) {
                        char optionLabel = (char) ('a' + k); // Generate A, B, C, etc.
                        writer.println("      " + optionLabel + ". " + question.getOptions().get(k));
                    }
                    writer.println();
                }
                writer.println();
            }
            JOptionPane.showMessageDialog(this, "Sets saved to " + saveFile.getAbsolutePath());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error while saving sets: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
    

    
    private void downloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downloadActionPerformed
   
public void convertTextToPdf(File textFile) throws DocumentException {
    Document document = new Document(); // Use iText's Document class
    try {
        // Specify the PDF output file path
        File pdfFile = new File(textFile.getParent(), "Converted_" + textFile.getName() + ".pdf");
        PdfWriter.getInstance(document, new FileOutputStream(pdfFile));

        // Open the document for writing
        document.open();

        // Read the text file and add its content to the PDF
        try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                document.add(new Paragraph(line)); // Add each line as a paragraph
            }
        }

        document.close(); // Close the document
        JOptionPane.showMessageDialog(this, "PDF created successfully: " + pdfFile.getAbsolutePath());
        Desktop.getDesktop().open(pdfFile); // Open the PDF automatically

    } catch (FileNotFoundException e) {
        JOptionPane.showMessageDialog(this, "Error: File not found. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error while reading/writing file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        if (document.isOpen()) {
            document.close(); // Ensure the document is closed
        }
    }
}

public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pdffile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Generate;
    private javax.swing.JButton Open;
    private javax.swing.JButton download;
    private javax.swing.JTextField filepath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables

}