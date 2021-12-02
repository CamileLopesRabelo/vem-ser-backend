package com.dbc.emailconsumidor.service;

import com.dbc.emailconsumidor.dto.EmailDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender emailSender;

    @Value("${spring.mail.username}")
    private String remetente;

    public void enviarEmail(EmailDTO emailDTO) throws MessagingException {
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(remetente);
        helper.setTo(emailDTO.getDestinatario());
        helper.setSubject(emailDTO.getAssunto());
        helper.setText(emailDTO.getTexto(),true);
        emailSender.send(message);
    }

//    public EmailDTO enviaEmail(EmailDTO emailDTO) throws MessagingException, IOException, TemplateException, TemplateException {
//        MimeMessage mimeMessage = emailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
//        helper.setFrom(remetente);
//        helper.setTo(emailDTO.getDestinatario());
//        helper.setSubject(emailDTO.getAssunto());
//        helper.setText(emailDTO.getTexto(), true);
//        emailSender.send(mimeMessage);
//
//        return emailDTO;
//    }
}
