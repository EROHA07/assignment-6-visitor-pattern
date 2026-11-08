package edu.aitu.filesystem;

/** Collects file count, directory count, and maximum tree depth. */
public class StatisticsVisitor implements Visitor {
    private int fileCount;
    private int directoryCount;
    private int maxDepth;

    public int getFileCount() {
        return fileCount;
    }

    public int getDirectoryCount() {
        return directoryCount;
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    @Override
    public void visit(FileNode file) {
        // TODO: count the file and update depth according to the chosen traversal design.
    }

    @Override
    public void visit(DirectoryNode directory) {
        // TODO: count this directory and traverse its children.
    }
}