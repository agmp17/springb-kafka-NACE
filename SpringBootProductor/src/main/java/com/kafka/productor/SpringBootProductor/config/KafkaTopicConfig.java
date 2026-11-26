package com.kafka.productor.SpringBootProductor.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic generaTopic() {

        Map<String, String> configuraciones = new HashMap<>();
        configuraciones.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);// DELETE: borra mensajes; COMPACT: Mantiene el actual
        configuraciones.put(TopicConfig.RETENTION_MS_CONFIG, "86400000"); // Tiempo de retencion de mensajes1 Dia en milisegundos; por defecto: -1 (no se borran)
        configuraciones.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1000000"); // Tamaño maximo del segmento en bytes (1 MB); por defecto: 1GB
        configuraciones.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "500000"); // Tamaño maximo de cada mensaje en bytes (0.5 MB); por defecto 1MB

        return TopicBuilder.name("topic1")
                .partitions(2)
                .replicas(2)
                .configs(configuraciones)
                .build();
    }
}
