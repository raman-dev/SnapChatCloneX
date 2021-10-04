package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.annotations.HasMany;

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

/** This is an auto generated class representing the DirectMessageChat type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "DirectMessageChats")
public final class DirectMessageChat implements Model {
  public static final QueryField ID = field("id");
  public static final QueryField CONVERSATION_ID = field("conversationId");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="ID", isRequired = true) String conversationId;
  private final @ModelField(targetType="Message") @HasMany(associatedWith = "conversationId", type = Message.class) List<Message> messages = null;
  public String getId() {
      return id;
  }
  
  public String getConversationId() {
      return conversationId;
  }
  
  public List<Message> getMessages() {
      return messages;
  }
  
  private DirectMessageChat(String id, String conversationId) {
    this.id = id;
    this.conversationId = conversationId;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      DirectMessageChat directMessageChat = (DirectMessageChat) obj;
      return ObjectsCompat.equals(getId(), directMessageChat.getId()) &&
              ObjectsCompat.equals(getConversationId(), directMessageChat.getConversationId());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getConversationId())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("DirectMessageChat {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("conversationId=" + String.valueOf(getConversationId()))
      .append("}")
      .toString();
  }
  
  public static ConversationIdStep builder() {
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
  public static DirectMessageChat justId(String id) {
    try {
      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
    } catch (Exception exception) {
      throw new IllegalArgumentException(
              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
              "of an existing object with only its ID field for sending as a mutation parameter. When " +
              "creating a new object, use the standard builder method and leave the ID field blank."
      );
    }
    return new DirectMessageChat(
      id,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      conversationId);
  }
  public interface ConversationIdStep {
    BuildStep conversationId(String conversationId);
  }
  

  public interface BuildStep {
    DirectMessageChat build();
    BuildStep id(String id) throws IllegalArgumentException;
  }
  

  public static class Builder implements ConversationIdStep, BuildStep {
    private String id;
    private String conversationId;
    @Override
     public DirectMessageChat build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new DirectMessageChat(
          id,
          conversationId);
    }
    
    @Override
     public BuildStep conversationId(String conversationId) {
        Objects.requireNonNull(conversationId);
        this.conversationId = conversationId;
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
    private CopyOfBuilder(String id, String conversationId) {
      super.id(id);
      super.conversationId(conversationId);
    }
    
    @Override
     public CopyOfBuilder conversationId(String conversationId) {
      return (CopyOfBuilder) super.conversationId(conversationId);
    }
  }
  
}
