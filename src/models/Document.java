package models;

public class Document {

    private final String docID;
    private String docLocation;
    private String docFileName;
    private String docTemplateID;

    /* For initialising new documents */
    public Document(String docID) {
        this.docID = docID;
        this.docLocation = null;
        this.docFileName = null;
        this.docTemplateID = null;
    }

    /* For initialising already build-up documents */
    public Document(String docID, String docLocation, String docFileName, String docTemplateID) {
        this.docID = docID;
        this.docLocation = docLocation;
        this.docFileName = docFileName;
        this.docTemplateID = docTemplateID;
    }

    /* Getters */
    public String getDocID() {
        return docID;
    }

    public String getDocLocation() {
        return docLocation;
    }

    public String getDocFileName() {
        return docFileName;
    }

    public String getDocTemplateID() {
        return docTemplateID;
    }

    /* Setters */
    public void setDocLocation(String docLocation) {
        this.docLocation = docLocation;
    }

    public void setDocFileName(String docFileName) {
        this.docFileName = docFileName;
    }

    public void setDocTemplateID(String docTemplateID) {
        this.docTemplateID = docTemplateID;
    }
}
