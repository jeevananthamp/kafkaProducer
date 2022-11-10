package com.thbs.EConnect.controller;

import java.util.List;
import java.util.Properties;

import org.apache.kafka.common.config.types.Password;
import com.thbs.EConnect.CONSTANTS.CONSTANTKEYS;
import com.thbs.EConnect.producers.ProducerMessage;
import com.thbs.EConnect.util.ProducerConfiguration;

public class ProducerBuilder<T> {
	static Properties properties;
	String configDefinitionName;
	ProducerMessage<T> producerData;
	String result;

	public ProducerBuilder() {
		properties = new Properties();
	}

	public void setBoostrap(T bootstrapserver) {
		properties.put(CONSTANTKEYS.BOOTSTRAPSERVER_KEY, bootstrapserver);
	}

	/**
	 * @param properties the properties to set
	 */

	public void setAcks(String acks) {
		properties.put(CONSTANTKEYS.ACKS_KEY, acks);
	}

	/**
	 * @param kEY_SERIALIZER the kEY_SERIALIZER to set
	 */
	public void setKeySerializer(String keySerializer) {
		properties.put(CONSTANTKEYS.KEYSERIALIZER_KEY, keySerializer);
	}

	/**
	 * @param vALUE_SERIALIZER the vALUE_SERIALIZER to set
	 */
	public void setValueSerializer(String valueSerializer) {
		properties.put(CONSTANTKEYS.VALUESERIALIZER_KEY, valueSerializer);
	}

	public void setBatchsize(int batchsize) {
		properties.put(CONSTANTKEYS.BATCHSIZE_KEY, batchsize);
	}

	public void setBuffermemory(Long buffermemory) {
		properties.put(CONSTANTKEYS.BUFFERMEMORY_KEY, buffermemory);
	}

	public void setRetries(int retries) {
		properties.put(CONSTANTKEYS.RETRIES_KEY, retries);
	}

	public void setLingerms(Long lingerms) {
		properties.put(CONSTANTKEYS.LINGERMS_KEY, lingerms);
	}

	public void setProducertopic(String producertopic) {
		properties.put(CONSTANTKEYS.PRODUCERTOPIC_KEY, producertopic);
	}

	public void setHeartbeat(int heartbeat) {
		properties.put(CONSTANTKEYS.HEARTBEAT_KEY, heartbeat);
	}

	public void setMaxpartitions(int maxpartitions) {
		properties.put(CONSTANTKEYS.MAXPARTITIONS_KEY, maxpartitions);
	}

	public void setSessiontimeout(int sessiontimeout) {
		properties.put(CONSTANTKEYS.SESSION_TIMEOUT_KEY, sessiontimeout);
	}

	public void setCompressiontype(String compressiontype) {
		properties.put(CONSTANTKEYS.COMPRESSION_TYPE_KEY, compressiontype);
	}

	public void setSslkeypassword(Password sslkeypassword) {
		properties.put(CONSTANTKEYS.SSL_KEY_PASSWORD_KEY, sslkeypassword);
	}

	public void setSslkeystorecertificatechain(Password sslkeystorecertificatechain) {
		properties.put(CONSTANTKEYS.SSL_KEYSTORE_CERTIFICATE_CHAIN_KEY, sslkeystorecertificatechain);
	}

	public void setSslkeystore(Password sslkeystore) {
		properties.put(CONSTANTKEYS.SSL_KEYSTORE_KEY, sslkeystore);
	}

	public void setSslkeystorelocation(String sslkeystorelocation) {
		properties.put(CONSTANTKEYS.SSL_KEYSTORE_LOCATION_KEY, sslkeystorelocation);
	}

	public void setSslkeystorepassword(Password sslkeystorepassword) {
		properties.put(CONSTANTKEYS.SSL_KEYSTORE_PASSWORD_KEY, sslkeystorepassword);
	}

	public void setSsltruststorecertificates(Password ssltruststorecertificates) {
		properties.put(CONSTANTKEYS.SSL_TRUSTSTORE_CERTIFICATES_KEY, ssltruststorecertificates);
	}

	public void setSsltruststoreloaction(String ssltruststoreloaction) {
		properties.put(CONSTANTKEYS.SSL_TRUSTSTORE_LOCATION_KEY, ssltruststoreloaction);
	}

	public void setSsltruststorepassword(Password ssltruststorepassword) {
		properties.put(CONSTANTKEYS.SSL_TRUSTSTORE_PASSWORD_KEY, ssltruststorepassword);
	}

	public void setClientdnslookup(String clientdnslookup) {
		properties.put(CONSTANTKEYS.CLIENT_DNS_LOOKUP_KEY, clientdnslookup);
	}

	public void setClientid(String clientid) {
		properties.put(CONSTANTKEYS.CLIENT_ID_KEY, clientid);
	}

	public void setConnectionidle(Long connectionidle) {
		properties.put(CONSTANTKEYS.CONNECTION_IDLE_KEY, connectionidle);
	}

	public void setDeliverytimeout(int deliverytimeout) {
		properties.put(CONSTANTKEYS.DELIVERY_TIMEOUT_KEY, deliverytimeout);
	}

	public void setPartitionerclass(Class partitionerclass) {
		properties.put(CONSTANTKEYS.PARTITIONER_CLASS_KEY, partitionerclass);
	}

	public void setReceivebufferbytes(int receivebufferbytes) {
		properties.put(CONSTANTKEYS.RECEIVE_BUFFER_BYTES_KEY, receivebufferbytes);
	}

	public void setRequesttimeout(int requesttimeout) {
		properties.put(CONSTANTKEYS.REQUEST_TIMEOUT_KEY, requesttimeout);
	}

	public void setSaslclientcallbackhandler(Class saslclientcallbackhandler) {
		properties.put(CONSTANTKEYS.SASL_CLIENT_CALLBACK_HANDLER_CLASS_KEY, saslclientcallbackhandler);
	}

	public void setSasljaasconfig(Password sasljaasconfig) {
		properties.put(CONSTANTKEYS.SASL_JAAS_CONFIG_KEY, sasljaasconfig);
	}

	public void setSaslkerberosservicename(String saslkerberosservicename) {
		properties.put(CONSTANTKEYS.SASL_KERBEROS_SERVICE_NAME_KEY, saslkerberosservicename);
	}

	public void setSasllogincallbackhandler(Class sasllogincallbackhandler) {
		properties.put(CONSTANTKEYS.SASL_LOGIN_CALLBACK_HANDLER_KEY, sasllogincallbackhandler);
	}

	public void setSaslloginclass(Class saslloginclass) {
		properties.put(CONSTANTKEYS.SASL_LOGIN_CLASS_KEY, saslloginclass);
	}

	public void setSaslmechanism(String saslmechanism) {
		properties.put(CONSTANTKEYS.SASL_MECHANISM_KEY, saslmechanism);
	}

	public void setSecurityprotocol(String securityprotocol) {
		properties.put(CONSTANTKEYS.SECURITY_PROTOCOL_KEY, securityprotocol);
	}

	public void setSendbufferbytes(int sendbufferbytes) {
		properties.put(CONSTANTKEYS.SEND_BUFFER_BYTES_KEY, sendbufferbytes);
	}

	public void setSocketconnectionsetuptimeoutmax(Long socketconnectionsetuptimeoutmax) {
		properties.put(CONSTANTKEYS.SOCKET_CONNECTION_SETUP_TIMEOUT_MAX_KEY, socketconnectionsetuptimeoutmax);
	}

	public void setSocketconnectionsetuptimeout(Long socketconnectionsetuptimeout) {
		properties.put(CONSTANTKEYS.SOCKET_CONNECTION_SETUP_TIMEOUT_KEY, socketconnectionsetuptimeout);
	}

	public void setSslenabledprotocols(List sslenabledprotocols) {
		properties.put(CONSTANTKEYS.SSL_ENABLED_PROTOCOLS_KEY, sslenabledprotocols);
	}

	public void setSslkeystoretype(String sslkeystoretype) {
		properties.put(CONSTANTKEYS.SSL_KEYSTORE_TYPE_KEY, sslkeystoretype);
	}

	public void setSslprotocol(String sslprotocol) {
		properties.put(CONSTANTKEYS.SSL_PROTOCOL_KEY, sslprotocol);
	}

	public void setSslprovider(String sslprovider) {
		properties.put(CONSTANTKEYS.SSL_PROVIDER_KEY, sslprovider);
	}

	public void setSsltruststoretype(String ssltruststoretype) {
		properties.put(CONSTANTKEYS.SSL_TRUSTSTORE_TYPE_KEY, ssltruststoretype);
	}

	public void setEnableidempotence(Boolean enableidempotence) {
		properties.put(CONSTANTKEYS.ENABLE_IDEMPOTENCE_KEY, enableidempotence);
	}

	public void setInterceptorclasses(List interceptorclasses) {
		properties.put(CONSTANTKEYS.INTERCEPTOR_CLASSES_KEY, interceptorclasses);
	}

	public void setMaxinflightsrequests(int maxinflightsrequests) {
		properties.put(CONSTANTKEYS.MAX_IN_FLIGHTS_REQUESTS_KEY, maxinflightsrequests);
	}

	public void setMetadatamaxage(Long metadatamaxage) {
		properties.put(CONSTANTKEYS.METADATA_MAX_AGE_KEY, metadatamaxage);
	}

	public void setMetadatamaxidle(Long metadatamaxidle) {
		properties.put(CONSTANTKEYS.METADATA_MAX_IDLE_KEY, metadatamaxidle);
	}

	public void setMetricreporters(List metricreporters) {
		properties.put(CONSTANTKEYS.METRIC_REPORTERS_KEY, metricreporters);
	}

	public void setMetricsnumsamples(int metricsnumsamples) {
		properties.put(CONSTANTKEYS.METRICS_NUM_SAMPLES_KEY, metricsnumsamples);
	}

	public void setMetricsrecordinglevel(String metricsrecordinglevel) {
		properties.put(CONSTANTKEYS.METRICS_RECORDING_LEVEL_KEY, metricsrecordinglevel);
	}

	public void setMetricssamplewindow(Long metricssamplewindow) {
		properties.put(CONSTANTKEYS.METRICS_SAMPLE_WINDOW_KEY, metricssamplewindow);
	}

	public void setReconnectbackoffmaxms(Long reconnectbackoffmaxms) {
		properties.put(CONSTANTKEYS.RECONNECT_BACKOFF_MAX_MS_KEY, reconnectbackoffmaxms);
	}

	public void setReconnectbackoffmax(Long reconnectbackoffmax) {
		properties.put(CONSTANTKEYS.RECONNECT_BACKOFF_MAX_KEY, reconnectbackoffmax);
	}

	public void setRetrybackoff(Long retrybackoff) {
		properties.put(CONSTANTKEYS.RETRY_BACKOFF_KEY, retrybackoff);
	}

	public void setSaslkerberoskinitcmd(String saslkerberoskinitcmd) {
		properties.put(CONSTANTKEYS.SASL_KERBEROS_KINIT_CMD_KEY, saslkerberoskinitcmd);
	}

	public void setSaslkerberosminrelogintime(Long saslkerberosminrelogintime) {
		properties.put(CONSTANTKEYS.SASL_KERBEROS_MIN_TIME_BEFORE_RELOGIN_KEY, saslkerberosminrelogintime);
	}

	public void setSaslkerberostcktrenewjitter(Double saslkerberostcktrenewjitter) {
		properties.put(CONSTANTKEYS.SASL_KERBEROS_TICKET_RENEW_JITTER_KEY, saslkerberostcktrenewjitter);
	}

	public void setSaslkerberostcktrenewwindowfactor(Double saslkerberostcktrenewwindowfactor) {
		properties.put(CONSTANTKEYS.SASL_KERBEROS_TICKET_RENEW_WINDOW_FACTOR_KEY, saslkerberostcktrenewwindowfactor);
	}

	public void setSaslloginrefreshbufferseconds(Short saslloginrefreshbufferseconds) {
		properties.put(CONSTANTKEYS.SASL_LOGIN_REFRESH_BUFFER_SECONDS_KEY, saslloginrefreshbufferseconds);
	}

	public void setSaslloginrefreshminperiodsc(Short saslloginrefreshminperiodsc) {
		properties.put(CONSTANTKEYS.SASL_LOGIN_REFRESH_MIN_PERIOD_SECONDS_KEY, saslloginrefreshminperiodsc);
	}

	public void setSaslloginrefreshwindowfactory(Double saslloginrefreshwindowfactory) {
		properties.put(CONSTANTKEYS.SASL_LOGIN_REFRESH_WINDOW_FACTOR_KEY, saslloginrefreshwindowfactory);
	}

	public void setSaslloginrefreshwindowjitter(Double saslloginrefreshwindowjitter) {
		properties.put(CONSTANTKEYS.SASL_LOGIN_REFRESH_WINDOW_JITTER_KEY, saslloginrefreshwindowjitter);
	}

	public void setSecurityproviders(String securityproviders) {
		properties.put(CONSTANTKEYS.SECURITY_PROVIDERS_KEY, securityproviders);
	}

	public void setSslciphersuites(List sslciphersuites) {
		properties.put(CONSTANTKEYS.SSL_CIPHER_SUITES_KEY, sslciphersuites);
	}

	public void setSslendpointidentificationalgorithm(String sslendpointidentificationalgorithm) {
		properties.put(CONSTANTKEYS.SSL_ENDPOINT_IDENTIFICATION_ALGORITHM_KEY, sslendpointidentificationalgorithm);
	}

	public void setSslenginefactoryclass(Class sslenginefactoryclass) {
		properties.put(CONSTANTKEYS.SSL_ENGINE_FACTORY_CLASS_KEY, sslenginefactoryclass);
	}

	public void setSslkeymanageralgorithm(String sslkeymanageralgorithm) {
		properties.put(CONSTANTKEYS.SSL_KEYMANAGER_ALGORITHM_KEY, sslkeymanageralgorithm);
	}

	public void setSslsecurerandomimplementation(String sslsecurerandomimplementation) {
		properties.put(CONSTANTKEYS.SSL_SECURE_RANDOM_IMPLEMENTATION_KEY, sslsecurerandomimplementation);
	}

	public void setSsltrustmanageralgorithm(String ssltrustmanageralgorithm) {
		properties.put(CONSTANTKEYS.SSL_TRUSTMANAGER_ALGORITHM_KEY, ssltrustmanageralgorithm);
	}

	public void setTransactionaltimeoutms(int transactionaltimeoutms) {
		properties.put(CONSTANTKEYS.TRANSACTION_TIMEOUT_MS_KEY, transactionaltimeoutms);
	}

	public void setTransactionalid(String transactionalid) {
		properties.put(CONSTANTKEYS.TRANSACTIONAL_ID_KEY, transactionalid);
	}

	public Properties getProducerConfiguration() {
		Properties configProperties = new Properties();

		ProducerConfiguration producerProp = new ProducerConfiguration(properties);
		configProperties = producerProp.getProducerProperties();

		return configProperties;
	}

	public String producerSendMessage(T modelObj, Properties properties, String topic) {

		this.producerData = new ProducerMessage<T>();
		this.producerData.buildProducer(modelObj, properties);
		result = this.producerData.sendRecords(topic, modelObj);
		this.producerData.flushProducer();

		return result;
	} 
}
