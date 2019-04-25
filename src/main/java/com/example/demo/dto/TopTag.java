package com.example.demo.dto;

public  class TopTag{

        private String modelCode;

        private String modelName;

        private Integer status;

        private Integer sort;

    public TopTag() {
    }

    public TopTag(String modelCode, String modelName, Integer status, Integer sort) {
        this.modelCode = modelCode;
        this.modelName = modelName;
        this.status = status;
        this.sort = sort;
    }

    public String getModelCode() {
            return modelCode;
        }

        public void setModelCode(String modelCode) {
            this.modelCode = modelCode;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getSort() {
            return sort;
        }

        public void setSort(Integer sort) {
            this.sort = sort;
        }

    @Override
    public String toString() {
        return "TopTag{" +
                "modelCode='" + modelCode + '\'' +
                ", modelName='" + modelName + '\'' +
                ", status=" + status +
                ", sort=" + sort +
                '}';
    }
}
