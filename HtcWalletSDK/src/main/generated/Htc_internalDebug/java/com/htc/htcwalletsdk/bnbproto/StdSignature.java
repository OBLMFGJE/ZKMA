// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bnbtx.proto

package com.htc.htcwalletsdk.bnbproto;

/**
 * Protobuf type {@code transaction.StdSignature}
 */
public  final class StdSignature extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:transaction.StdSignature)
    StdSignatureOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StdSignature.newBuilder() to construct.
  private StdSignature(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StdSignature() {
    pubKey_ = com.google.protobuf.ByteString.EMPTY;
    signature_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StdSignature();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StdSignature(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {

            pubKey_ = input.readBytes();
            break;
          }
          case 18: {

            signature_ = input.readBytes();
            break;
          }
          case 24: {

            accountNumber_ = input.readInt64();
            break;
          }
          case 32: {

            sequence_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.htc.htcwalletsdk.bnbproto.Transaction.internal_static_transaction_StdSignature_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.htc.htcwalletsdk.bnbproto.Transaction.internal_static_transaction_StdSignature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.htc.htcwalletsdk.bnbproto.StdSignature.class, com.htc.htcwalletsdk.bnbproto.StdSignature.Builder.class);
  }

  public interface PubKeyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:transaction.StdSignature.PubKey)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * please note there is no type prefix for StdSignature
   * </pre>
   *
   * Protobuf type {@code transaction.StdSignature.PubKey}
   */
  public  static final class PubKey extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:transaction.StdSignature.PubKey)
      PubKeyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PubKey.newBuilder() to construct.
    private PubKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PubKey() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PubKey();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PubKey(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.htc.htcwalletsdk.bnbproto.Transaction.internal_static_transaction_StdSignature_PubKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.htc.htcwalletsdk.bnbproto.Transaction.internal_static_transaction_StdSignature_PubKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey.class, com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey)) {
        return super.equals(obj);
      }
      com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey other = (com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey) obj;

      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * please note there is no type prefix for StdSignature
     * </pre>
     *
     * Protobuf type {@code transaction.StdSignature.PubKey}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:transaction.StdSignature.PubKey)
        com.htc.htcwalletsdk.bnbproto.StdSignature.PubKeyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.htc.htcwalletsdk.bnbproto.Transaction.internal_static_transaction_StdSignature_PubKey_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.htc.htcwalletsdk.bnbproto.Transaction.internal_static_transaction_StdSignature_PubKey_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey.class, com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey.Builder.class);
      }

      // Construct using com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.htc.htcwalletsdk.bnbproto.Transaction.internal_static_transaction_StdSignature_PubKey_descriptor;
      }

      @java.lang.Override
      public com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey getDefaultInstanceForType() {
        return com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey.getDefaultInstance();
      }

      @java.lang.Override
      public com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey build() {
        com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey buildPartial() {
        com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey result = new com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey(this);
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey) {
          return mergeFrom((com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey other) {
        if (other == com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:transaction.StdSignature.PubKey)
    }

    // @@protoc_insertion_point(class_scope:transaction.StdSignature.PubKey)
    private static final com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey();
    }

    public static com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PubKey>
        PARSER = new com.google.protobuf.AbstractParser<PubKey>() {
      @java.lang.Override
      public PubKey parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PubKey(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PubKey> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PubKey> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.htc.htcwalletsdk.bnbproto.StdSignature.PubKey getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int PUB_KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString pubKey_;
  /**
   * <pre>
   * public key bytes of the signer address
   * </pre>
   *
   * <code>bytes pub_key = 1;</code>
   */
  public com.google.protobuf.ByteString getPubKey() {
    return pubKey_;
  }

  public static final int SIGNATURE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString signature_;
  /**
   * <pre>
   * signature bytes, please check chain access section for signature generation
   * </pre>
   *
   * <code>bytes signature = 2;</code>
   */
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
  }

  public static final int ACCOUNT_NUMBER_FIELD_NUMBER = 3;
  private long accountNumber_;
  /**
   * <pre>
   * another identifier of signer, which can be read from chain by account REST API or RPC
   * </pre>
   *
   * <code>int64 account_number = 3;</code>
   */
  public long getAccountNumber() {
    return accountNumber_;
  }

  public static final int SEQUENCE_FIELD_NUMBER = 4;
  private long sequence_;
  /**
   * <pre>
   * sequence number for the next transaction of the client, which can be read fro chain by account REST API or RPC. please check chain acces section for details.
   * </pre>
   *
   * <code>int64 sequence = 4;</code>
   */
  public long getSequence() {
    return sequence_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!pubKey_.isEmpty()) {
      output.writeBytes(1, pubKey_);
    }
    if (!signature_.isEmpty()) {
      output.writeBytes(2, signature_);
    }
    if (accountNumber_ != 0L) {
      output.writeInt64(3, accountNumber_);
    }
    if (sequence_ != 0L) {
      output.writeInt64(4, sequence_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!pubKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, pubKey_);
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, signature_);
    }
    if (accountNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, accountNumber_);
    }
    if (sequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, sequence_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.htc.htcwalletsdk.bnbproto.StdSignature)) {
      return super.equals(obj);
    }
    com.htc.htcwalletsdk.bnbproto.StdSignature other = (com.htc.htcwalletsdk.bnbproto.StdSignature) obj;

    if (!getPubKey()
        .equals(other.getPubKey())) return false;
    if (!getSignature()
        .equals(other.getSignature())) return false;
    if (getAccountNumber()
        != other.getAccountNumber()) return false;
    if (getSequence()
        != other.getSequence()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPubKey().hashCode();
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (37 * hash) + ACCOUNT_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAccountNumber());
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequence());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.htc.htcwalletsdk.bnbproto.StdSignature parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.htc.htcwalletsdk.bnbproto.StdSignature parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.htc.htcwalletsdk.bnbproto.StdSignature parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.htc.htcwalletsdk.bnbproto.StdSignature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.htc.htcwalletsdk.bnbproto.StdSignature parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.htc.htcwalletsdk.bnbproto.StdSignature parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.htc.htcwalletsdk.bnbproto.StdSignature parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.htc.htcwalletsdk.bnbproto.StdSignature parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.htc.htcwalletsdk.bnbproto.StdSignature parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.htc.htcwalletsdk.bnbproto.StdSignature parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.htc.htcwalletsdk.bnbproto.StdSignature parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.htc.htcwalletsdk.bnbproto.StdSignature parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.htc.htcwalletsdk.bnbproto.StdSignature prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code transaction.StdSignature}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:transaction.StdSignature)
      com.htc.htcwalletsdk.bnbproto.StdSignatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.htc.htcwalletsdk.bnbproto.Transaction.internal_static_transaction_StdSignature_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.htc.htcwalletsdk.bnbproto.Transaction.internal_static_transaction_StdSignature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.htc.htcwalletsdk.bnbproto.StdSignature.class, com.htc.htcwalletsdk.bnbproto.StdSignature.Builder.class);
    }

    // Construct using com.htc.htcwalletsdk.bnbproto.StdSignature.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      pubKey_ = com.google.protobuf.ByteString.EMPTY;

      signature_ = com.google.protobuf.ByteString.EMPTY;

      accountNumber_ = 0L;

      sequence_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.htc.htcwalletsdk.bnbproto.Transaction.internal_static_transaction_StdSignature_descriptor;
    }

    @java.lang.Override
    public com.htc.htcwalletsdk.bnbproto.StdSignature getDefaultInstanceForType() {
      return com.htc.htcwalletsdk.bnbproto.StdSignature.getDefaultInstance();
    }

    @java.lang.Override
    public com.htc.htcwalletsdk.bnbproto.StdSignature build() {
      com.htc.htcwalletsdk.bnbproto.StdSignature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.htc.htcwalletsdk.bnbproto.StdSignature buildPartial() {
      com.htc.htcwalletsdk.bnbproto.StdSignature result = new com.htc.htcwalletsdk.bnbproto.StdSignature(this);
      result.pubKey_ = pubKey_;
      result.signature_ = signature_;
      result.accountNumber_ = accountNumber_;
      result.sequence_ = sequence_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.htc.htcwalletsdk.bnbproto.StdSignature) {
        return mergeFrom((com.htc.htcwalletsdk.bnbproto.StdSignature)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.htc.htcwalletsdk.bnbproto.StdSignature other) {
      if (other == com.htc.htcwalletsdk.bnbproto.StdSignature.getDefaultInstance()) return this;
      if (other.getPubKey() != com.google.protobuf.ByteString.EMPTY) {
        setPubKey(other.getPubKey());
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
      }
      if (other.getAccountNumber() != 0L) {
        setAccountNumber(other.getAccountNumber());
      }
      if (other.getSequence() != 0L) {
        setSequence(other.getSequence());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.htc.htcwalletsdk.bnbproto.StdSignature parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.htc.htcwalletsdk.bnbproto.StdSignature) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString pubKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * public key bytes of the signer address
     * </pre>
     *
     * <code>bytes pub_key = 1;</code>
     */
    public com.google.protobuf.ByteString getPubKey() {
      return pubKey_;
    }
    /**
     * <pre>
     * public key bytes of the signer address
     * </pre>
     *
     * <code>bytes pub_key = 1;</code>
     */
    public Builder setPubKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pubKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * public key bytes of the signer address
     * </pre>
     *
     * <code>bytes pub_key = 1;</code>
     */
    public Builder clearPubKey() {
      
      pubKey_ = getDefaultInstance().getPubKey();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * signature bytes, please check chain access section for signature generation
     * </pre>
     *
     * <code>bytes signature = 2;</code>
     */
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <pre>
     * signature bytes, please check chain access section for signature generation
     * </pre>
     *
     * <code>bytes signature = 2;</code>
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      signature_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * signature bytes, please check chain access section for signature generation
     * </pre>
     *
     * <code>bytes signature = 2;</code>
     */
    public Builder clearSignature() {
      
      signature_ = getDefaultInstance().getSignature();
      onChanged();
      return this;
    }

    private long accountNumber_ ;
    /**
     * <pre>
     * another identifier of signer, which can be read from chain by account REST API or RPC
     * </pre>
     *
     * <code>int64 account_number = 3;</code>
     */
    public long getAccountNumber() {
      return accountNumber_;
    }
    /**
     * <pre>
     * another identifier of signer, which can be read from chain by account REST API or RPC
     * </pre>
     *
     * <code>int64 account_number = 3;</code>
     */
    public Builder setAccountNumber(long value) {
      
      accountNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * another identifier of signer, which can be read from chain by account REST API or RPC
     * </pre>
     *
     * <code>int64 account_number = 3;</code>
     */
    public Builder clearAccountNumber() {
      
      accountNumber_ = 0L;
      onChanged();
      return this;
    }

    private long sequence_ ;
    /**
     * <pre>
     * sequence number for the next transaction of the client, which can be read fro chain by account REST API or RPC. please check chain acces section for details.
     * </pre>
     *
     * <code>int64 sequence = 4;</code>
     */
    public long getSequence() {
      return sequence_;
    }
    /**
     * <pre>
     * sequence number for the next transaction of the client, which can be read fro chain by account REST API or RPC. please check chain acces section for details.
     * </pre>
     *
     * <code>int64 sequence = 4;</code>
     */
    public Builder setSequence(long value) {
      
      sequence_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * sequence number for the next transaction of the client, which can be read fro chain by account REST API or RPC. please check chain acces section for details.
     * </pre>
     *
     * <code>int64 sequence = 4;</code>
     */
    public Builder clearSequence() {
      
      sequence_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:transaction.StdSignature)
  }

  // @@protoc_insertion_point(class_scope:transaction.StdSignature)
  private static final com.htc.htcwalletsdk.bnbproto.StdSignature DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.htc.htcwalletsdk.bnbproto.StdSignature();
  }

  public static com.htc.htcwalletsdk.bnbproto.StdSignature getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StdSignature>
      PARSER = new com.google.protobuf.AbstractParser<StdSignature>() {
    @java.lang.Override
    public StdSignature parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StdSignature(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StdSignature> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StdSignature> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.htc.htcwalletsdk.bnbproto.StdSignature getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

