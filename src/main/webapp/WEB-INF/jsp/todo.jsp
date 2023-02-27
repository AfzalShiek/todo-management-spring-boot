<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="panel panel-primary">
				<div class="panel-heading">Add EMPLOYEES</div>
				<div class="panel-body">
					<form:form method="post" modelAttribute="todo">
						<form:hidden path="id" />
						<fieldset class="form-group">
							<form:label path="description">Name</form:label>
							<form:input path="description" type="text" class="form-control"
								required="required" />
							<form:errors path="description" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
							<form:label path="email">Email</form:label>
							<form:input path="email" type="text" class="form-control"
								required="required" />
							<form:errors path="email" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="targetDate">DOB</form:label>
							<form:input path="targetDate" type="text" class="form-control"
								required="required" />
							<form:errors path="targetDate" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
							<form:label path="salary">Salary</form:label>
							<form:input path="salary" type="text" class="form-control"
								required="required" />
							<form:errors path="salary" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<b>Active</b><form:radiobutton path="status" value="1"/><br><br>
							<b>InActive</b><form:radiobutton path="status" value="0"/><br>
						</fieldset>
						
						

						<button type="submit" class="btn btn-success">Save</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>