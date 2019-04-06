package ca.concordia.alexa.SquattingRecorder.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.concordia.alexa.SquattingRecorder.enums.SquattingType;
import ca.concordia.alexa.SquattingRecorder.models.SquattingRecording;
import ca.concordia.alexa.SquattingRecorder.repositories.SquattigRecorderRepository;

@Service
public class SquattingRecorderService {

  private final SquattigRecorderRepository squattigRecorderRepository;
  
  @Autowired
  public SquattingRecorderService(SquattigRecorderRepository squattigRecorderRepository) {
    this.squattigRecorderRepository = squattigRecorderRepository;
  }
  
  public SquattingRecording recordSquatting(String type, String text) {
    return squattigRecorderRepository.save(new SquattingRecording(SquattingType.valueOf(type), text));
  }
  
  public List<SquattingRecording> getSquattingByType(String type){
    return squattigRecorderRepository.findAllByType(SquattingType.valueOf(type));
  }
  
}
