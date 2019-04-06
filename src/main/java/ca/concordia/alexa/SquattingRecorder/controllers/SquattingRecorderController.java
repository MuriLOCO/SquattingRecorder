package ca.concordia.alexa.SquattingRecorder.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ca.concordia.alexa.SquattingRecorder.models.SquattingRecording;
import ca.concordia.alexa.SquattingRecorder.services.SquattingRecorderService;

@RestController
public class SquattingRecorderController {

  private final SquattingRecorderService squattingRecorderService;

  @Autowired
  public SquattingRecorderController(SquattingRecorderService squattingRecorderService) {
    this.squattingRecorderService = squattingRecorderService;
  }

  @RequestMapping(value = "/recordSquatting", method = RequestMethod.POST)
  public SquattingRecording recordSquatting(@RequestParam(required = true) String type,
        @RequestParam(required = true) String text) {
    return squattingRecorderService.recordSquatting(type, text);
  }
  
  @RequestMapping(value = "/getRecording", method = RequestMethod.GET)
  public List<SquattingRecording> getRecording(@RequestParam(required = true) String type){
    return squattingRecorderService.getSquattingByType(type);
  }

}
