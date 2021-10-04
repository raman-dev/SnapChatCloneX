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

/** This is an auto generated class representing the FriendRequestResponse type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "FriendRequestResponses")
@Index(name = "byRequestSender", fields = {"requestSenderId"})
public final class FriendRequestResponse implements Model {
  public static final QueryField ID = field("id");
  public static final QueryField REQUEST_SENDER_ID = field("requestSenderId");
  public static final QueryField ACCEPTED = field("accepted");
  public static final QueryField CONVERSATION_ID = field("conversationId");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="ID", isRequired = true) String requestSenderId;
  private final @ModelField(targetType="Boolean", isRequired = true) Boolean accepted;
  private final @ModelField(targetType="ID") String conversationId;
  public String getId() {
      return id;
  }
  
  public String getRequestSenderId() {
      return requestSenderId;
  }
  
  public Boolean getAccepted() {
      return accepted;
  }
  
  public String getConversationId() {
      return conversationId;
  }
  
  private FriendRequestResponse(String id, String requestSenderId, Boolean accepted, String conversationId) {
    this.id = id;
    this.requestSenderId = requestSenderId;
    this.accepted = accepted;
    this.conversationId = conversationId;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      FriendRequestResponse friendRequestResponse = (FriendRequestResponse) obj;
      return ObjectsCompat.equals(getId(), friendRequestResponse.getId()) &&
              ObjectsCompat.equals(getRequestSenderId(), friendRequestResponse.getRequestSenderId()) &&
              ObjectsCompat.equals(getAccepted(), friendRequestResponse.getAccepted()) &&
              ObjectsCompat.equals(getConversationId(), friendRequestResponse.getConversationId());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getRequestSenderId())
      .append(getAccepted())
      .append(getConversationId())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("FriendRequestResponse {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("requestSenderId=" + String.valueOf(getRequestSenderId()) + ", ")
      .append("accepted=" + String.valueOf(getAccepted()) + ", ")
      .append("conversationId=" + String.valueOf(getConversationId()))
      .append("}")
      .toString();
  }
  
  public static RequestSenderIdStep builder() {
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
  public static FriendRequestResponse justId(String id) {
    try {
      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
    } catch (Exception exception) {
      throw new IllegalArgumentException(
              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
              "of an existing object with only its ID field for sending as a mutation parameter. When " +
              "creating a new object, use the standard builder method and leave the ID field blank."
      );
    }
    return new FriendRequestResponse(
      id,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      requestSenderId,
      accepted,
      conversationId);
  }
  public interface RequestSenderIdStep {
    AcceptedStep requestSenderId(String requestSenderId);
  }
  

  public interface AcceptedStep {
    BuildStep accepted(Boolean accepted);
  }
  

  public interface BuildStep {
    FriendRequestResponse build();
    BuildStep id(String id) throws IllegalArgumentException;
    BuildStep conversationId(String conversationId);
  }
  

  public static class Builder implements RequestSenderIdStep, AcceptedStep, BuildStep {
    private String id;
    private String requestSenderId;
    private Boolean accepted;
    private String conversationId;
    @Override
     public FriendRequestResponse build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new FriendRequestResponse(
          id,
          requestSenderId,
          accepted,
          conversationId);
    }
    
    @Override
     public AcceptedStep requestSenderId(String requestSenderId) {
        Objects.requireNonNull(requestSenderId);
        this.requestSenderId = requestSenderId;
        return this;
    }
    
    @Override
     public BuildStep accepted(Boolean accepted) {
        Objects.requireNonNull(accepted);
        this.accepted = accepted;
        return this;
    }
    
    @Override
     public BuildStep conversationId(String conversationId) {
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
    private CopyOfBuilder(String id, String requestSenderId, Boolean accepted, String conversationId) {
      super.id(id);
      super.requestSenderId(requestSenderId)
        .accepted(accepted)
        .conversationId(conversationId);
    }
    
    @Override
     public CopyOfBuilder requestSenderId(String requestSenderId) {
      return (CopyOfBuilder) super.requestSenderId(requestSenderId);
    }
    
    @Override
     public CopyOfBuilder accepted(Boolean accepted) {
      return (CopyOfBuilder) super.accepted(accepted);
    }
    
    @Override
     public CopyOfBuilder conversationId(String conversationId) {
      return (CopyOfBuilder) super.conversationId(conversationId);
    }
  }
  
}
