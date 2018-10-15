<%--
  Created by IntelliJ IDEA.
  User: "Mr.KKu"
  Date: 2018-10-16
  Time: 오전 1:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- title --%>
<div class="row">
    <div class="col-lg-12">
        <h2>List groups</h2>
    </div>
</div>

<%-- left --%>
<div class="row">
    <div class="col-lg-4">
        <div class="bs-component">
            <ul class="list-group">
                <li class="list-group-item d-flex justify-content-between align-items-center">
                    Cras justo odio
                    <span class="badge badge-primary badge-pill">14</span>
                </li>
                <li class="list-group-item d-flex justify-content-between align-items-center">
                    Dapibus ac facilisis in
                    <span class="badge badge-primary badge-pill">2</span>
                </li>
                <li class="list-group-item d-flex justify-content-between align-items-center">
                    Morbi leo risus
                    <span class="badge badge-primary badge-pill">1</span>
                </li>
            </ul>
        </div>
    </div>
    <div class="col-lg-4">
        <div class="bs-component">
            <div class="list-group">
                <a href="#" class="list-group-item list-group-item-action active">
                    Cras justo odio
                </a>
                <a href="#" class="list-group-item list-group-item-action">Dapibus ac facilisis in
                </a>
                <a href="#" class="list-group-item list-group-item-action disabled">Morbi leo risus
                </a>
            </div>
            <div id="source-button" class="btn btn-primary btn-xs" style="display: none;">&lt; &gt;</div></div>
    </div>
    <div class="col-lg-4">
        <div class="bs-component">
            <div class="list-group">
                <a href="#" class="list-group-item list-group-item-action flex-column align-items-start active">
                    <div class="d-flex w-100 justify-content-between">
                        <h5 class="mb-1">List group item heading</h5>
                        <small>3 days ago</small>
                    </div>
                    <p class="mb-1">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>
                    <small>Donec id elit non mi porta.</small>
                </a>
                <a href="#" class="list-group-item list-group-item-action flex-column align-items-start">
                    <div class="d-flex w-100 justify-content-between">
                        <h5 class="mb-1">List group item heading</h5>
                        <small class="text-muted">3 days ago</small>
                    </div>
                    <p class="mb-1">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>
                    <small class="text-muted">Donec id elit non mi porta.</small>
                </a>
            </div>
        </div>
    </div>
</div>
