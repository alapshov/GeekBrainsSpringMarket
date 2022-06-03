package ru.geekbrains.march.market.api;

import java.util.List;

public class PageDto {
    private Long page;
    private Long size;
    private List<ProductDto> productDtoList;

    public PageDto(Long page, Long size, ProductDto productDto){
        this.page = page;
        this.size = size;
        this.getProductDtoList().add(productDto);
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public List<ProductDto> getProductDtoList() {
        return productDtoList;
    }

    public void setProductDtoList(List<ProductDto> productDtoList) {
        this.productDtoList = productDtoList;
    }
}
