package org.wjw.test.dubbo.validation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public interface ValidationService {
    void save(ValidationParamter parameter);
    
    void update(ValidationParamter parameter);
    
    void delete(@Min(1) long id,
                @NotNull @Size(min = 2, max = 16) String operation);
}
