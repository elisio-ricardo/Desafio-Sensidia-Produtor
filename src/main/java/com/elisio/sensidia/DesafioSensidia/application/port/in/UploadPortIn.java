package com.elisio.sensidia.DesafioSensidia.application.port.in;


import com.elisio.sensidia.DesafioSensidia.framework.adapter.in.dto.UploadResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public interface UploadPortIn {

   void uploadService(MultipartFile file, UploadResponseDTO metadata);
}
