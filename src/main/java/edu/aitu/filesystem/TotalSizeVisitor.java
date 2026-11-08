package edu.aitu.filesystem;

/** Calculates the total size of all files in the visited tree. */
public class TotalSizeVisitor implements Visitor {
    private long totalSize;

    public long getTotalSize() {
        return totalSize;
    }

    @Override
    public void visit(FileNode file) {
        // TODO: add this file's size exactly once.
    }

    @Override
    public void visit(DirectoryNode directory) {
        // TODO: traverse the directory's children.
    }
}