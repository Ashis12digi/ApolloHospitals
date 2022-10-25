<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Patients List</h1>
<form action=" ">
<div th:replace="common/header :: navbar" />
	
	<div class="container">
		<div class="table-responsive">
			<table id="patientListTable" class="table table-bordered table-hover table-striped">
				<thead>
					<tr>
						<!-- <th><input th:id="selectAllPatients" type="checkbox" /></th> -->
						<th>First Name</th>
						
						
						<th>Age</th>
						
						<th>Treated by</th>
						
					</tr>
				</thead>
				<tbody>
					<tr data-th-each="patient : ${patientList}">
						<!-- <td>
						<input hidden="hidden" name="id" th:value="${patient.id}" />
						<input th:id="'selected'+${patient.id}" class="checkboxPatient" type="checkbox" />
						</td> -->
						<td><a th:href="@{/patient/patientInfo(id=${patient.id})}"><span th:text="${patient.name}"></span></a></td>
						
					
						<td th:text="${patient.age}"></td>
						
						<td th:text="${patient.doctorName}"></td>
						
					</tr>
				</tbody>
			</table>
		</div>
	<!-- <button th:id="deleteSelected" class="btn btn-danger ">Delete Selected</button> -->
	</div>
	
</form>

</body>
</html>