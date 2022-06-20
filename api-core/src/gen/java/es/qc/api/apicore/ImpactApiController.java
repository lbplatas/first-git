package es.qc.api.apicore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-16T14:05:38.997555200+02:00[Europe/Madrid]")
@Controller
@RequestMapping("${openapi.impact.base-path:/banking}")
public class ImpactApiController implements ImpactApi {

    private final ImpactApiDelegate delegate;

    public ImpactApiController(@Autowired(required = false) ImpactApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ImpactApiDelegate() {});
    }

    @Override
    public ImpactApiDelegate getDelegate() {
        return delegate;
    }

}
