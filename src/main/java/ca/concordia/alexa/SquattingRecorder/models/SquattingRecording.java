package ca.concordia.alexa.SquattingRecorder.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ca.concordia.alexa.SquattingRecorder.enums.SquattingType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "squatting_recordig")
public class SquattingRecording {

  public SquattingRecording() {    
  }
  
  public SquattingRecording(Enum<SquattingType> type, String text) {
    this.type = type;
    this.text = text;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(name = "type")
  private Enum<SquattingType> type;
  @Column(name = "capture")
  private String text;

}
