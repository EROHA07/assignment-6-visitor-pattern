package edu.aitu.filesystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** A directory that owns child file-system elements. */
public class DirectoryNode implements FileSystemElement {
    private final String name;
    private final List<FileSystemElement> children = new ArrayList<>();

    public DirectoryNode(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Directory name must not be blank");
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    /** Adds a child. Extend this method with the ownership and cycle checks from the specification. */
    public void addChild(FileSystemElement child) {
        if (child == null) {
            throw new IllegalArgumentException("Child must not be null");
        }
        if (child == this) {
            throw new IllegalArgumentException("A directory cannot contain itself");
        }
        for (FileSystemElement existing : children) {
            if (existing.getName().equals(child.getName())) {
                throw new IllegalArgumentException("Duplicate sibling name: " + child.getName());
            }
        }
        children.add(child);
    }

    public List<FileSystemElement> getChildren() {
        return Collections.unmodifiableList(children);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}