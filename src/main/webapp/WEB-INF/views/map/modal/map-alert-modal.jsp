<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div class="modal fade cmmn-modal" id="alertModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalLabel">알림</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <div class="d-flex flex-column p-2 gap-2">
                    <div class="default-input-group">
                        <label>자율명</label>
                        <input value="무인 자율 #1"/>
                    </div>
                    <div class="default-input-group">
                        <label>자율번호</label>
                        <input value="20 대 4256" />
                    </div>
                    <div class="default-input-group">
                        <label>모델</label>
                        <input value="K-5" />
                    </div>
                    <div class="default-input-group">
                        <label>Secret Key</label>
                        <input value="K25HIKJFDL"/>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="custom-btn green" data-bs-dismiss="modal">등록</button>
                <button type="button" class="custom-btn orange" data-bs-dismiss="modal">수정</button>
                <button type="button" class="custom-btn red" data-bs-dismiss="modal">삭제</button>
            </div>
        </div>
    </div>
</div>