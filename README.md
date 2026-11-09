# Visitor Pattern – Advanced File System

## Project
An in-memory hierarchical file system implemented in Java 17. The project demonstrates the Visitor design pattern with files and directories.

## Requirements
- Java 17
- Apache Maven

## Build and test
Run from the project root:

```bash
mvn test
```

## Run the demo
After implementing the demo entry point:

```bash
mvn compile
```

## Design
- `FileSystemElement` defines the element contract.
- `FileNode` represents a file.
- `DirectoryNode` represents a directory containing other elements.
- `Visitor` defines overloaded visit operations.
- `TotalSizeVisitor`, `SearchVisitor`, and `StatisticsVisitor` perform separate operations over the file system.

