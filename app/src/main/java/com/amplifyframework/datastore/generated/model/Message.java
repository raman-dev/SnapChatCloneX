package com.amplifyframework.datastore.generated.model;


import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the Message type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Messages")
@Index(name = "byConversation", fields = {"conversationId"})
public final class Message implements Model {
  public static final QueryField ID = field("id");
  public static final QueryField AUTHOR_ID = field("authorId");
  public static final QueryField RECIPIENT_ID = field("recipientId");
  public static final QueryField CONVERSATION_ID = field("conversationId");
  public static final QueryField CONTENT = field("content");
  public static final QueryField CREATED_AT = field("createdAt");
  public static final QueryField IS_SNAP = field("isSnap");
  public static final QueryField BUCKET = field("bucket");
  public static final QueryField REGION = field("region");
  public static final QueryField KEY = field("key");
  public static final QueryField UNREAD = field("unread");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="ID", isRequired = true) String authorId;
  private final @ModelField(targetType="ID", isRequired = true) String recipientId;
  private final @ModelField(targetType="ID", isRequired = true) String conversationId;
  private final @ModelField(targetType="String") String content;
  private final @ModelField(targetType="String") String createdAt;
  private final @ModelField(targetType="Boolean", isRequired = true) Boolean isSnap;
  private final @ModelField(targetType="String") String bucket;
  private final @ModelField(targetType="String") String region;
  private final @ModelField(targetType="String") String key;
  private final @ModelField(targetType="Boolean") Boolean unread;
  public String getId() {
      return id;
  }
  
  public String getAuthorId() {
      return authorId;
  }
  
  public String getRecipientId() {
      return recipientId;
  }
  
  public String getConversationId() {
      return conversationId;
  }
  
  public String getContent() {
      return content;
  }
  
  public String getCreatedAt() {
      return createdAt;
  }
  
  public Boolean getIsSnap() {
      return isSnap;
  }
  
  public String getBucket() {
      return bucket;
  }
  
  public String getRegion() {
      return region;
  }
  
  public String getKey() {
      return key;
  }
  
  public Boolean getUnread() {
      return unread;
  }
  
  private Message(String id, String authorId, String recipientId, String conversationId, String content, String createdAt, Boolean isSnap, String bucket, String region, String key, Boolean unread) {
    this.id = id;
    this.authorId = authorId;
    this.recipientId = recipientId;
    this.conversationId = conversationId;
    this.content = content;
    this.createdAt = createdAt;
    this.isSnap = isSnap;
    this.bucket = bucket;
    this.region = region;
    this.key = key;
    this.unread = unread;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Message message = (Message) obj;
      return ObjectsCompat.equals(getId(), message.getId()) &&
              ObjectsCompat.equals(getAuthorId(), message.getAuthorId()) &&
              ObjectsCompat.equals(getRecipientId(), message.getRecipientId()) &&
              ObjectsCompat.equals(getConversationId(), message.getConversationId()) &&
              ObjectsCompat.equals(getContent(), message.getContent()) &&
              ObjectsCompat.equals(getCreatedAt(), message.getCreatedAt()) &&
              ObjectsCompat.equals(getIsSnap(), message.getIsSnap()) &&
              ObjectsCompat.equals(getBucket(), message.getBucket()) &&
              ObjectsCompat.equals(getRegion(), message.getRegion()) &&
              ObjectsCompat.equals(getKey(), message.getKey()) &&
              ObjectsCompat.equals(getUnread(), message.getUnread());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getAuthorId())
      .append(getRecipientId())
      .append(getConversationId())
      .append(getContent())
      .append(getCreatedAt())
      .append(getIsSnap())
      .append(getBucket())
      .append(getRegion())
      .append(getKey())
      .append(getUnread())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Message {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("authorId=" + String.valueOf(getAuthorId()) + ", ")
      .append("recipientId=" + String.valueOf(getRecipientId()) + ", ")
      .append("conversationId=" + String.valueOf(getConversationId()) + ", ")
      .append("content=" + String.valueOf(getContent()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("isSnap=" + String.valueOf(getIsSnap()) + ", ")
      .append("bucket=" + String.valueOf(getBucket()) + ", ")
      .append("region=" + String.valueOf(getRegion()) + ", ")
      .append("key=" + String.valueOf(getKey()) + ", ")
      .append("unread=" + String.valueOf(getUnread()))
      .append("}")
      .toString();
  }
  
  public static AuthorIdStep builder() {
      return new Builder();
  }
  
  /** 
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   * @throws IllegalArgumentException Checks that ID is in the proper format
   */
  public static Message justId(String id) {
    try {
      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
    } catch (Exception exception) {
      throw new IllegalArgumentException(
              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
              "of an existing object with only its ID field for sending as a mutation parameter. When " +
              "creating a new object, use the standard builder method and leave the ID field blank."
      );
    }
    return new Message(
      id,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      authorId,
      recipientId,
      conversationId,
      content,
      createdAt,
      isSnap,
      bucket,
      region,
      key,
      unread);
  }
  public interface AuthorIdStep {
    RecipientIdStep authorId(String authorId);
  }
  

  public interface RecipientIdStep {
    ConversationIdStep recipientId(String recipientId);
  }
  

  public interface ConversationIdStep {
    IsSnapStep conversationId(String conversationId);
  }
  

  public interface IsSnapStep {
    BuildStep isSnap(Boolean isSnap);
  }
  

  public interface BuildStep {
    Message build();
    BuildStep id(String id) throws IllegalArgumentException;
    BuildStep content(String content);
    BuildStep createdAt(String createdAt);
    BuildStep bucket(String bucket);
    BuildStep region(String region);
    BuildStep key(String key);
    BuildStep unread(Boolean unread);
  }
  

  public static class Builder implements AuthorIdStep, RecipientIdStep, ConversationIdStep, IsSnapStep, BuildStep {
    private String id;
    private String authorId;
    private String recipientId;
    private String conversationId;
    private Boolean isSnap;
    private String content;
    private String createdAt;
    private String bucket;
    private String region;
    private String key;
    private Boolean unread;
    @Override
     public Message build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Message(
          id,
          authorId,
          recipientId,
          conversationId,
          content,
          createdAt,
          isSnap,
          bucket,
          region,
          key,
          unread);
    }
    
    @Override
     public RecipientIdStep authorId(String authorId) {
        Objects.requireNonNull(authorId);
        this.authorId = authorId;
        return this;
    }
    
    @Override
     public ConversationIdStep recipientId(String recipientId) {
        Objects.requireNonNull(recipientId);
        this.recipientId = recipientId;
        return this;
    }
    
    @Override
     public IsSnapStep conversationId(String conversationId) {
        Objects.requireNonNull(conversationId);
        this.conversationId = conversationId;
        return this;
    }
    
    @Override
     public BuildStep isSnap(Boolean isSnap) {
        Objects.requireNonNull(isSnap);
        this.isSnap = isSnap;
        return this;
    }
    
    @Override
     public BuildStep content(String content) {
        this.content = content;
        return this;
    }
    
    @Override
     public BuildStep createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @Override
     public BuildStep bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    
    @Override
     public BuildStep region(String region) {
        this.region = region;
        return this;
    }
    
    @Override
     public BuildStep key(String key) {
        this.key = key;
        return this;
    }
    
    @Override
     public BuildStep unread(Boolean unread) {
        this.unread = unread;
        return this;
    }
    
    /** 
     * WARNING: Do not set ID when creating a new object. Leave this blank and one will be auto generated for you.
     * This should only be set when referring to an already existing object.
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     * @throws IllegalArgumentException Checks that ID is in the proper format
     */
    public BuildStep id(String id) throws IllegalArgumentException {
        this.id = id;
        
        try {
            UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
        } catch (Exception exception) {
          throw new IllegalArgumentException("Model IDs must be unique in the format of UUID.",
                    exception);
        }
        
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String authorId, String recipientId, String conversationId, String content, String createdAt, Boolean isSnap, String bucket, String region, String key, Boolean unread) {
      super.id(id);
      super.authorId(authorId)
        .recipientId(recipientId)
        .conversationId(conversationId)
        .isSnap(isSnap)
        .content(content)
        .createdAt(createdAt)
        .bucket(bucket)
        .region(region)
        .key(key)
        .unread(unread);
    }
    
    @Override
     public CopyOfBuilder authorId(String authorId) {
      return (CopyOfBuilder) super.authorId(authorId);
    }
    
    @Override
     public CopyOfBuilder recipientId(String recipientId) {
      return (CopyOfBuilder) super.recipientId(recipientId);
    }
    
    @Override
     public CopyOfBuilder conversationId(String conversationId) {
      return (CopyOfBuilder) super.conversationId(conversationId);
    }
    
    @Override
     public CopyOfBuilder isSnap(Boolean isSnap) {
      return (CopyOfBuilder) super.isSnap(isSnap);
    }
    
    @Override
     public CopyOfBuilder content(String content) {
      return (CopyOfBuilder) super.content(content);
    }
    
    @Override
     public CopyOfBuilder createdAt(String createdAt) {
      return (CopyOfBuilder) super.createdAt(createdAt);
    }
    
    @Override
     public CopyOfBuilder bucket(String bucket) {
      return (CopyOfBuilder) super.bucket(bucket);
    }
    
    @Override
     public CopyOfBuilder region(String region) {
      return (CopyOfBuilder) super.region(region);
    }
    
    @Override
     public CopyOfBuilder key(String key) {
      return (CopyOfBuilder) super.key(key);
    }
    
    @Override
     public CopyOfBuilder unread(Boolean unread) {
      return (CopyOfBuilder) super.unread(unread);
    }
  }
  
}
