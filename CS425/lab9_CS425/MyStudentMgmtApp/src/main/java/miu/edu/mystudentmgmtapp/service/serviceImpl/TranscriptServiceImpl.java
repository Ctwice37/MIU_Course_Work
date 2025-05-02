package miu.edu.mystudentmgmtapp.service.serviceImpl;

import miu.edu.mystudentmgmtapp.model.Transcript;
import miu.edu.mystudentmgmtapp.repository.TranscriptRepo;
import miu.edu.mystudentmgmtapp.service.transcriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranscriptServiceImpl implements transcriptService {

    private TranscriptRepo transcriptRepo;

    @Autowired
    private TranscriptServiceImpl(TranscriptRepo transcriptRepo) {
        this.transcriptRepo = transcriptRepo;
    }

    @Override
    public Transcript createTranscript(Transcript transcript) {
        return transcriptRepo.save(transcript);
    }
}
