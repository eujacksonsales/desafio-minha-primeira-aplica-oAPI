package dio.minha_primeira_web_api.handler;


public class BusinessException extends RuntimeException{
    public BusinessException(String mensagem){
        super(mensagem);
    }

    public BusinessException(String mensagem, Object ... params){
        super(String.format(mensagem,params));
    }
}
