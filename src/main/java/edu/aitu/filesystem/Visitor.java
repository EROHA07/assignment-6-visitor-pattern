package edu.aitu.filesystem;

/** Operations supported by the file-system elements. */
public interface Visitor {
    void visit(FileNode file);
    void visit(DirectoryNode directory);
}