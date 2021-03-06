// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krotoplus/compiler/config.proto

package com.github.marcoferrer.krotoplus.config;

public interface InsertionsGenOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:krotoplus.compiler.InsertionsGenOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Filter used for limiting the input files that are processed by the code generator
   * The default filter will match true against all input files.
   * </pre>
   *
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  boolean hasFilter();
  /**
   * <pre>
   * Filter used for limiting the input files that are processed by the code generator
   * The default filter will match true against all input files.
   * </pre>
   *
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  com.github.marcoferrer.krotoplus.config.FileFilter getFilter();
  /**
   * <pre>
   * Filter used for limiting the input files that are processed by the code generator
   * The default filter will match true against all input files.
   * </pre>
   *
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  com.github.marcoferrer.krotoplus.config.FileFilterOrBuilder getFilterOrBuilder();

  /**
   * <pre>
   * List of configurations to be applied to the file filter.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.InsertionsGenOptions.Entry entry = 2;</code>
   */
  java.util.List<com.github.marcoferrer.krotoplus.config.InsertionsGenOptions.Entry> 
      getEntryList();
  /**
   * <pre>
   * List of configurations to be applied to the file filter.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.InsertionsGenOptions.Entry entry = 2;</code>
   */
  com.github.marcoferrer.krotoplus.config.InsertionsGenOptions.Entry getEntry(int index);
  /**
   * <pre>
   * List of configurations to be applied to the file filter.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.InsertionsGenOptions.Entry entry = 2;</code>
   */
  int getEntryCount();
  /**
   * <pre>
   * List of configurations to be applied to the file filter.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.InsertionsGenOptions.Entry entry = 2;</code>
   */
  java.util.List<? extends com.github.marcoferrer.krotoplus.config.InsertionsGenOptions.EntryOrBuilder> 
      getEntryOrBuilderList();
  /**
   * <pre>
   * List of configurations to be applied to the file filter.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.InsertionsGenOptions.Entry entry = 2;</code>
   */
  com.github.marcoferrer.krotoplus.config.InsertionsGenOptions.EntryOrBuilder getEntryOrBuilder(
      int index);
}
