const API_URL = "http://localhost:8080/reports";

async function submitReport() {

    const report = {
        facultyName: document.getElementById("facultyName").value,
        department: document.getElementById("department").value,
        month: document.getElementById("month").value,
        classesHandled: document.getElementById("classesHandled").value,
        hoursWorked: document.getElementById("hoursWorked").value,
        activities: document.getElementById("activities").value
    };

    await fetch(API_URL, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(report)
    });

    loadReports();
}

async function loadReports() {

    const response = await fetch(API_URL);
    const reports = await response.json();

    const reportList = document.getElementById("reportList");

    reportList.innerHTML = "";

    reports.forEach(report => {

        reportList.innerHTML += `
            <div class="report">
                <h3>${report.facultyName}</h3>
                <p>Department: ${report.department}</p>
                <p>Month: ${report.month}</p>
                <p>Classes: ${report.classesHandled}</p>
                <p>Hours: ${report.hoursWorked}</p>
                <p>Activities: ${report.activities}</p>
            </div>
        `;
    });
}

loadReports();