package io.bumo.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import io.bumo.model.response.result.TokenAllowanceHttpResults;

/**
 * @Author riven
 * @Date 2018/7/6 12:31
 */
public class TokenAllowanceHttpResponse extends ResponseBase {
    @JSONField(name = "result")
    private TokenAllowanceHttpResults result;

    /**
     * @Author riven
     * @Method getResult
     * @Params []
     * @Return io.bumo.model.response.result.TokenIssueResult
     * @Date 2018/7/6 11:17
     */
    public TokenAllowanceHttpResults getResult() {
        return result;
    }

    /**
     * @Author riven
     * @Method setResult
     * @Params [result]
     * @Return void
     * @Date 2018/7/6 11:18
     */
    public void setResult(TokenAllowanceHttpResults result) {
        this.result = result;
    }
}