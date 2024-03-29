package com.indivie.cms.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchOutletProductRequest {
    private Integer page;
    private Integer size;
    private String supplierId;
    private String outletId;
}
