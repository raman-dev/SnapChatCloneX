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

/** This is an auto generated class representing the FriendRequest type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "FriendRequests")
@Index(name = "byRecipient", fields = {"recipientId"})
public final class FriendRequest implements Model {
  public static final QueryField ID = field("id");
  public static final QueryField AUTHOR_ID = field("authorId");
  public static final QueryField AUTHOR_USERNAME = field("authorUsername");
  public static final QueryField RECIPIENT_ID = field("recipientId");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="ID", isRequired = true) String authorId;
  private final @ModelField(targetType="String", isRequired = true) String authorUsername;
  private final @ModelField(targetType="ID", isRequired = true) String recipientId;
  public String getId() {
      return id;
  }
  
  public String getAuthorId() {
      return authorId;
  }
  
  public String getAuthorUsername() {
      return authorUsername;
  }
  
  public String getRecipientId() {
      return recipientId;
  }
  
  private FriendRequest(String id, String authorId, String authorUsername, String recipientId) {
    this.id = id;
    this.authorId = authorId;
    this.authorUsername = authorUsername;
    this.recipientId = recipientId;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      FriendRequest friendRequest = (FriendRequest) obj;
      return ObjectsCompat.equals(getId(), friendRequest.getId()) &&
              ObjectsCompat.equals(getAuthorId(), friendRequest.getAuthorId()) &&
              ObjectsCompat.equals(getAuthorUsername(), friendRequest.getAuthorUsername()) &&
              ObjectsCompat.equals(getRecipientId(), friendRequest.getRecipientId());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getAuthorId())
      .append(getAuthorUsername())
      .append(getRecipientId())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("FriendRequest {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("authorId=" + String.valueOf(getAuthorId()) + ", ")
      .append("authorUsername=" + String.valueOf(getAuthorUsername()) + ", ")
      .append("recipientId=" + String.valueOf(getRecipientId()))
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
  public static FriendRequest justId(String id) {
    try {
      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
    } catch (Exception exception) {
      throw new IllegalArgumentException(
              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
              "of an existing object with only its ID field for sending as a mutation parameter. When " +
              "creating a new object, use the standard builder method and leave the ID field blank."
      );
    }
    return new FriendRequest(
      id,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      authorId,
      authorUsername,
      recipientId);
  }
  public interface AuthorIdStep {
    AuthorUsernameStep authorId(String authorId);
  }
  

  public interface AuthorUsernameStep {
    RecipientIdStep authorUsername(String authorUsername);
  }
  

  public interface RecipientIdStep {
    BuildStep recipientId(String recipientId);
  }
  

  public interface BuildStep {
    FriendRequest build();
    BuildStep id(String id) throws IllegalArgumentException;
  }
  

  public static class Builder implements AuthorIdStep, AuthorUsernameStep, RecipientIdStep, BuildStep {
    private String id;
    private String authorId;
    private String authorUsername;
    private String recipientId;
    @Override
     public FriendRequest build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new FriendRequest(
          id,
          authorId,
          authorUsername,
          recipientId);
    }
    
    @Override
     public AuthorUsernameStep authorId(String authorId) {
        Objects.requireNonNull(authorId);
        this.authorId = authorId;
        return this;
    }
    
    @Override
     public RecipientIdStep authorUsername(String authorUsername) {
        Objects.requireNonNull(authorUsername);
        this.authorUsername = authorUsername;
        return this;
    }
    
    @Override
     public BuildStep recipientId(String recipientId) {
        Objects.requireNonNull(recipientId);
        this.recipientId = recipientId;
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
    private CopyOfBuilder(String id, String authorId, String authorUsername, String recipientId) {
      super.id(id);
      super.authorId(authorId)
        .authorUsername(authorUsername)
        .recipientId(recipientId);
    }
    
    @Override
     public CopyOfBuilder authorId(String authorId) {
      return (CopyOfBuilder) super.authorId(authorId);
    }
    
    @Override
     public CopyOfBuilder authorUsername(String authorUsername) {
      return (CopyOfBuilder) super.authorUsername(authorUsername);
    }
    
    @Override
     public CopyOfBuilder recipientId(String recipientId) {
      return (CopyOfBuilder) super.recipientId(recipientId);
    }
  }
  
}
