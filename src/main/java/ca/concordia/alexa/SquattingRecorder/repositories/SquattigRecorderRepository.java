package ca.concordia.alexa.SquattingRecorder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.concordia.alexa.SquattingRecorder.enums.SquattingType;
import ca.concordia.alexa.SquattingRecorder.models.SquattingRecording;

public interface SquattigRecorderRepository extends JpaRepository<SquattingRecording, Long> {

  List<SquattingRecording> findAllByType(Enum<SquattingType> type);
}
