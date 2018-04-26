package h04n6.sqlite_example;

import java.io.Serializable;

/**
 * Created by hoang on 2/14/2018.
 */

public class Note implements Serializable {

    private int noteId;
    private String noteTitle;
    private String noteContent;

    public Note(){

    }

    public Note(String noteTitle, String noteContent){
        this.noteTitle = noteTitle;
        this.noteContent = noteContent;
    }

    public Note(int noteId, String noteTitle, String noteContent){
        this.noteId = noteId;
        this.noteTitle = noteTitle;
        this.noteContent = noteContent;
    }

    public int getNoteId(){
        return noteId;
    }

    public void setNoteId(int noteId){
        this.noteId = noteId;
    }

    public String getNoteTitle(){
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle){
        this.noteTitle = noteTitle;
    }

    public String getNoteContent(){
        return noteContent;
    }

    public void setNoteContent(String noteContent){
        this.noteContent = noteContent;
    }

    @Override
    public String toString(){
        return this.noteTitle;
    }
}
































