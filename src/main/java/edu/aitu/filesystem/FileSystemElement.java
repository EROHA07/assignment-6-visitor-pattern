package edu.aitu.filesystem;

/** Common contract for files and directories. */
public interface FileSystemElement {
    String getName();
    void accept(Visitor visitor);
}