<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
    content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Activity Control</title>

<!-- Custom fonts for this template-->
<link href="/resources/assets/vendor/fontawesome-free/css/all.min.css"
    rel="stylesheet" type="text/css">
<link
    href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
    rel="stylesheet">

<!-- Custom styles for this template-->
<link href="/resources/assets/css/sb-admin-2.min.css" rel="stylesheet">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Include Chart.js library -->
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
<link rel="stylesheet"
    href="https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css">
<script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>
<link rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
<script type="text/javascript">
/* Add this CSS style to your existing styles */
.dropdown-menu {
    max-height: 200px; 
    overflow-y: auto;
}
</script>


</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <ul
            class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
            id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a
                class="sidebar-brand d-flex align-items-center justify-content-center"
                href="index.jsp">
                <div class="sidebar-brand-icon rotate-n-15">
                    <i class="fas fa-laugh-wink"></i>
                </div>
                <div class="sidebar-brand-text mx-3">Activity Control</div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item active"><a class="nav-link" href="index.jsp">
                    <i class="fas fa-fw fa-tachometer-alt"></i> <span>Dashboard</span>
            </a></li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">Interface</div>

            <!-- Nav Item - Pages Collapse Menu -->
            <li class="nav-item"><a class="nav-link collapsed" href="#"
                data-toggle="collapse" data-target="#collapseTwo"
                aria-expanded="true" aria-controls="collapseTwo"> <i
                    class="fas fa-fw fa-cog"></i> <span>Components</span>
            </a>
                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
                    data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Custom Components:</h6>
                        <a class="collapse-item" href="buttons.jsp">Buttons</a> <a
                            class="collapse-item" href="cards.jsp">Cards</a>
                    </div>
                </div></li>

            <!-- Nav Item - Utilities Collapse Menu -->
            <li class="nav-item"><a class="nav-link collapsed" href="#"
                data-toggle="collapse" data-target="#collapseUtilities"
                aria-expanded="true" aria-controls="collapseUtilities"> <i
                    class="fas fa-fw fa-wrench"></i> <span>Utilities</span>
            </a>
                <div id="collapseUtilities" class="collapse"
                    aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Custom Utilities:</h6>
                        <a class="collapse-item" href="utilities-color.jsp">Colors</a> <a
                            class="collapse-item" href="utilities-border.jsp">Borders</a> <a
                            class="collapse-item" href="utilities-animation.jsp">Animations</a>
                        <a class="collapse-item" href="utilities-other.jsp">Other</a>
                    </div>
                </div></li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">Addons</div>

            <!-- Nav Item - Pages Collapse Menu -->
            <li class="nav-item"><a class="nav-link collapsed" href="#"
                data-toggle="collapse" data-target="#collapsePages"
                aria-expanded="true" aria-controls="collapsePages"> <i
                    class="fas fa-fw fa-folder"></i> <span>Pages</span>
            </a>
                <div id="collapsePages" class="collapse"
                    aria-labelledby="headingPages" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Login Screens:</h6>
                        <a class="collapse-item" href="login.jsp">Login</a> <a
                            class="collapse-item" href="register.jsp">Register</a> <a
                            class="collapse-item" href="forgot-password.jsp">Forgot
                            Password</a>
                        <div class="collapse-divider"></div>
                        <h6 class="collapse-header">Other Pages:</h6>
                        <a class="collapse-item" href="404.jsp">404 Page</a> <a
                            class="collapse-item" href="blank.jsp">Blank Page</a>
                    </div>
                </div></li>

            <!-- Nav Item - Charts -->
            <li class="nav-item"><a class="nav-link" href="/api/charts">
                    <i class="fas fa-fw fa-chart-area"></i> <span>Charts</span>
            </a></li>

            <!-- Nav Item - Tables -->
            <li class="nav-item"><a class="nav-link"
                href="/api/attendencepage"> <i class="fas fa-fw fa-table"></i> <span>Attendence</span></a>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider d-none d-md-block">

            <!-- Sidebar Toggler (Sidebar) -->
            <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle"></button>
            </div>



        </ul>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav
                    class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                    <!-- Sidebar Toggle (Topbar) -->
                    <button id="sidebarToggleTop"
                        class="btn btn-link d-md-none rounded-circle mr-3">
                        <i class="fa fa-bars"></i>
                    </button>

                    <!-- Topbar Search -->
                    <form
                        class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
                        <div class="input-group">
                            <input type="text" class="form-control bg-light border-0 small"
                                placeholder="Search for..." aria-label="Search"
                                aria-describedby="basic-addon2">
                            <div class="input-group-append">
                                <button class="btn btn-primary" type="button">
                                    <i class="fas fa-search fa-sm"></i>
                                </button>
                            </div>
                        </div>
                    </form>

                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">

                        <!-- Nav Item - Search Dropdown (Visible Only XS) -->
                        <li class="nav-item dropdown no-arrow d-sm-none"><a
                            class="nav-link dropdown-toggle" href="#" id="searchDropdown"
                            role="button" data-toggle="dropdown" aria-haspopup="true"
                            aria-expanded="false"> <i class="fas fa-search fa-fw"></i>
                        </a> <!-- Dropdown - Messages -->
                            <div
                                class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
                                aria-labelledby="searchDropdown">
                                <form class="form-inline mr-auto w-100 navbar-search">
                                    <div class="input-group">
                                        <input type="text"
                                            class="form-control bg-light border-0 small"
                                            placeholder="Search for..." aria-label="Search"
                                            aria-describedby="basic-addon2">
                                        <div class="input-group-append">
                                            <button class="btn btn-primary" type="button">
                                                <i class="fas fa-search fa-sm"></i>
                                            </button>
                                        </div>
                                    </div>
                                </form>
                            </div></li>

                        <!-- Nav Item - Alerts -->
                        <li class="nav-item dropdown no-arrow mx-1"><a
                            class="nav-link dropdown-toggle" href="#" id="alertsDropdown"
                            role="button" data-toggle="dropdown" aria-haspopup="true"
                            aria-expanded="false"> <i class="fas fa-bell fa-fw"></i> <!-- Counter - Alerts -->
                                <span class="badge badge-danger badge-counter">3+</span>
                        </a> <!-- Dropdown - Alerts -->
                            <div
                                class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                aria-labelledby="alertsDropdown">
                                <h6 class="dropdown-header">Alerts Center</h6>
                                <a class="dropdown-item d-flex align-items-center" href="#">
                                    <div class="mr-3">
                                        <div class="icon-circle bg-primary">
                                            <i class="fas fa-file-alt text-white"></i>
                                        </div>
                                    </div>
                                    <div>
                                        <div class="small text-gray-500">December 12, 2019</div>
                                        <span class="font-weight-bold">A new monthly report is
                                            ready to download!</span>
                                    </div>
                                </a> <a class="dropdown-item d-flex align-items-center" href="#">
                                    <div class="mr-3">
                                        <div class="icon-circle bg-success">
                                            <i class="fas fa-donate text-white"></i>
                                        </div>
                                    </div>
                                    <div>
                                        <div class="small text-gray-500">December 7, 2019</div>
                                        $290.29 has been deposited into your account!
                                    </div>
                                </a> <a class="dropdown-item d-flex align-items-center" href="#">
                                    <div class="mr-3">
                                        <div class="icon-circle bg-warning">
                                            <i class="fas fa-exclamation-triangle text-white"></i>
                                        </div>
                                    </div>
                                    <div>
                                        <div class="small text-gray-500">December 2, 2019</div>
                                        Spending Alert: We've noticed unusually high spending for your
                                        account.
                                    </div>
                                </a> <a class="dropdown-item text-center small text-gray-500"
                                    href="#">Show All Alerts</a>
                            </div></li>

                        <!-- Nav Item - Messages -->
                        <li class="nav-item dropdown no-arrow mx-1"><a
                            class="nav-link dropdown-toggle" href="#" id="messagesDropdown"
                            role="button" data-toggle="dropdown" aria-haspopup="true"
                            aria-expanded="false"> <i class="fas fa-envelope fa-fw"></i>
                                <!-- Counter - Messages --> <span
                                class="badge badge-danger badge-counter">7</span>
                        </a> <!-- Dropdown - Messages -->
                            <div
                                class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                aria-labelledby="messagesDropdown">
                                <h6 class="dropdown-header">Message Center</h6>
                                <a class="dropdown-item d-flex align-items-center" href="#">
                                    <div class="dropdown-list-image mr-3">
                                        <img class="rounded-circle"
                                            src="/resources/assets/img/undraw_profile_1.svg" alt="...">
                                        <div class="status-indicator bg-success"></div>
                                    </div>
                                    <div class="font-weight-bold">
                                        <div class="text-truncate">Hi there! I am wondering if
                                            you can help me with a problem I've been having.</div>
                                        <div class="small text-gray-500">Emily Fowler · 58m</div>
                                    </div>
                                </a> <a class="dropdown-item d-flex align-items-center" href="#">
                                    <div class="dropdown-list-image mr-3">
                                        <img class="rounded-circle"
                                            src="/resources/assets/img/undraw_profile_2.svg" alt="...">
                                        <div class="status-indicator"></div>
                                    </div>
                                    <div>
                                        <div class="text-truncate">I have the photos that you
                                            ordered last month, how would you like them sent to you?</div>
                                        <div class="small text-gray-500">Jae Chun · 1d</div>
                                    </div>
                                </a> <a class="dropdown-item d-flex align-items-center" href="#">
                                    <div class="dropdown-list-image mr-3">
                                        <img class="rounded-circle"
                                            src="/resources/assets/img/undraw_profile_3.svg" alt="...">
                                        <div class="status-indicator bg-warning"></div>
                                    </div>
                                    <div>
                                        <div class="text-truncate">Last month's report looks
                                            great, I am very happy with the progress so far, keep up the
                                            good work!</div>
                                        <div class="small text-gray-500">Morgan Alvarez · 2d</div>
                                    </div>
                                </a> <a class="dropdown-item d-flex align-items-center" href="#">
                                    <div class="dropdown-list-image mr-3">
                                        <img class="rounded-circle"
                                            src="https://source.unsplash.com/Mv9hjnEUHR4/60x60" alt="...">
                                        <div class="status-indicator bg-success"></div>
                                    </div>
                                    <div>
                                        <div class="text-truncate">Am I a good boy? The reason I
                                            ask is because someone told me that people say this to all
                                            dogs, even if they aren't good...</div>
                                        <div class="small text-gray-500">Chicken the Dog · 2w</div>
                                    </div>
                                </a> <a class="dropdown-item text-center small text-gray-500"
                                    href="#">Read More Messages</a>
                            </div></li>

                        <div class="topbar-divider d-none d-sm-block"></div>

                        <!-- Nav Item - User Information -->
                        <li class="nav-item dropdown no-arrow"><a
                            class="nav-link dropdown-toggle" href="#" id="userDropdown"
                            role="button" data-toggle="dropdown" aria-haspopup="true"
                            aria-expanded="false"> <span
                                class="mr-2 d-none d-lg-inline text-gray-600 small">Douglas
                                    McGee</span> <img class="img-profile rounded-circle"
                                src="/resources/assets/img/undraw_profile.svg">
                        </a> <!-- Dropdown - User Information -->
                            <div
                                class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                aria-labelledby="userDropdown">
                                <a class="dropdown-item" href="#"> <i
                                    class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i> Profile
                                </a> <a class="dropdown-item" href="#"> <i
                                    class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Settings
                                </a> <a class="dropdown-item" href="#"> <i
                                    class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Activity Log
                                </a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#" data-toggle="modal"
                                    data-target="#logoutModal"> <i
                                    class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Logout
                                </a>
                            </div></li>

                    </ul>

                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div
                        class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
                        <a href="#"
                            class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                            class="fas fa-download fa-sm text-white-50"></i> Generate Report</a>
                    </div>

                    <!-- Content Row -->
                    <div class="row">

                        <!-- Earnings (Monthly) Card Example -->
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div class="card border-left-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                        <div class="text-xs font-weight-bold text-primary text-uppercase mb-1">
    Total Strength (Employees)
</div>
<div id="totalCount" class="h5 mb-0 font-weight-bold text-gray-800">Loading...</div>

<script>
    // Fetch present data from /api/punchpresent
    fetch('/api/attendence')
    .then(response => response.json())
    .then(data => {
        // Update the punch count in the DOM
        const punchPresentCountElement = document.getElementById('totalCount');
        
        if (Array.isArray(data)) {
            punchPresentCountElement.textContent = data.length;
        } else {
            punchPresentCountElement.textContent = 'N/A';
        }
    })
    .catch(error => {
        console.error('Error fetching punch data:', error);
        // Display an error message or handle the error as needed
    });
</script>


                                        </div>
                                        <div class="col-auto">
                                            <i class=" class="fasfa-userstext-gray-300"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Earnings (Monthly) Card Example -->
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div class="card border-left-success shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs font-weight-bold text-success text-uppercase mb-1">
    Employees Present
</div>
<div id="presentCount" class="h5 mb-0 font-weight-bold text-gray-800">Loading...</div>

<script>
    // Fetch present data from /api/punchpresent
    fetch('/api/punchpresent')
    .then(response => response.json())
    .then(data => {
        // Update the punch count in the DOM
        const punchPresentCountElement = document.getElementById('presentCount');
        
        if (Array.isArray(data)) {
            punchPresentCountElement.textContent = data.length;
        } else {
            punchPresentCountElement.textContent = 'N/A';
        }
    })
    .catch(error => {
        console.error('Error fetching punch data:', error);
        // Display an error message or handle the error as needed
    });
</script>

                                        </div>
                                        <div class="col-auto"></div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Earnings (Monthly) Card Example -->
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div class="card border-left-info shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs font-weight-bold text-success text-uppercase mb-1">
   Absenties
</div>
<div id="punchCount" class="h5 mb-0 font-weight-bold text-gray-800">Loading...</div>

<script>
    // Fetch punch data from /api/punch
    fetch('/api/punch')
        .then(response => response.json())
        .then(data => {
            // Update the punch count in the DOM
            const punchCountElement = document.getElementById('punchCount');
            
            if (Array.isArray(data)) {
                punchCountElement.textContent = data.length;
            } else {
                punchCountElement.textContent = 'N/A';
            }
        })
        .catch(error => {
            console.error('Error fetching punch data:', error);
            // Display an error message or handle the error as needed
        });
</script>

                                            <div class="row no-gutters align-items-center">
                                                <div class="col-auto">
                                                    <div class="h5 mb-0 mr-3 font-weight-bold text-gray-800"></div>
                                                </div>
                                                <div class="col"></div>
                                            </div>
                                        </div>
                                        <div class="col-auto"></div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Pending Requests Card Example -->
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div class="card border-left-warning shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div
                                                class="text-xs font-weight-bold text-warning text-uppercase mb-1">
                                                Employees on Leave</div>
                                            <div class="h5 mb-0 font-weight-bold text-gray-800"></div>
                                        </div>
                                        <div class="col-auto">
                                            <i class="fas fa-comments fa-2x text-gray-300"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Content Row -->
                    <div class="container-fluid">

                        <div
                            class="d-sm-flex align-items-center justify-content-between mb-4">
                            <h1 class="h3 mb-0 text-gray-800" style="margin-right: -592px;"></h1>

                            <!-- Team Dropdown -->
                            <!--                            <div class="dropdown ml-2"> -->
                            <!--                                <button class="btn btn-secondary dropdown-toggle" type="button" -->
                            <!--                                    id="teamDropdown" data-toggle="dropdown" aria-haspopup="true" -->
                            <!--                                    aria-expanded="false" -->
                            <!--                                    style="background-color: #fff !important; color: #2d2d2d; width: 216px;"> -->
                            <!--                                    <i class="fas fa-users mr-2"></i> Select Team -->
                            <!--                                </button> -->
                            <!--                                <div class="dropdown-menu" aria-labelledby="teamDropdown" -->
                            <!--                                    id="teamDropdownMenu"> -->
                            <!--                                    Dropdown items will be dynamically added here -->
                            <!--                                </div> -->
                            <!--                            </div> -->
                            <!-- HTML structure for the dropdown -->
                            <div class="dropdown ml-2">
                                <button class="btn btn-secondary dropdown-toggle" type="button"
                                    id="teamDropdown" data-toggle="dropdown" aria-haspopup="true"
                                    aria-expanded="false"
                                    style="background-color: #fff !important; color: #2d2d2d; width: 216px;">
                                    <i class="fas fa-users mr-2"></i> Select Team
                                </button>
                                <div class="dropdown-menu" aria-labelledby="teamDropdown"
                                    id="teamDropdownMenu"
                                    style="max-height: 200px; overflow-y: auto;">
                                    <!-- Dropdown items will be dynamically added here -->
                                </div>
                            </div>





                            <!-- Date Range Picker -->
                            <div class="ml-2">

                                <!-- <label for="datePicker">Select Date:</label> -->
                                <!--             <input type="text" id="datePicker" class="form-control" placeholder="Select Date"> -->

                                <div class="input-group">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text"><i
                                            class="fas fa-calendar-alt"></i></span>
                                    </div>
                                    <!--         <input type="text" id="dateRangePicker" class="form-control" placeholder="Select Date Range"> -->
                                    <input type="text" id="datePicker" class="form-control"
                                        placeholder="Select Date">
                                </div>
                            </div>

                        </div>
<div class="row">

                        <!-- Area Chart -->
                        <div class="col-xl-8 col-lg-7">
                            <div class="card shadow mb-4">
                                <!-- Card Header - Dropdown -->
                                <div
                                    class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                    <h6 class="m-0 font-weight-bold text-primary">Activity Analysis</h6>
                                    <div class="dropdown no-arrow">
                                        <a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink"
                                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
                                        </a>
                                        
                                        <div class="dropdown-menu dropdown-menu-right shadow animated--fade-in"
                                            aria-labelledby="dropdownMenuLink">
                                            <div class="dropdown-header">Dropdown Header:</div>
                                            <a class="dropdown-item" href="#">Action</a>
                                            <a class="dropdown-item" href="#">Another action</a>
                                            <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="#">Something else here</a>
                                        </div>
                                    </div>
                                </div>
                                <!-- Card Body -->
                                <div class="card-body">
                                    <div class="chart-area">
                                        <canvas id="myBarChart"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Pie Chart -->
                        <div class="col-xl-4 col-lg-5">
                            <div class="card shadow mb-4">
                                <!-- Card Header - Dropdown -->
                              <div
                                class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                <h6 class="m-0 font-weight-bold text-primary">Today's
                                    Attendance</h6>
                                <div class="dropdown no-arrow">
                                    <a class="dropdown-toggle" href="#" role="button"
                                        id="dropdownMenuLink" data-toggle="dropdown"
                                        aria-haspopup="true" aria-expanded="false"> <i
                                        class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
                                    </a>
                                    <div
                                        class="dropdown-menu dropdown-menu-right shadow animated--fade-in"
                                        aria-labelledby="dropdownMenuLink">
                                        <div class="dropdown-header">Dropdown Header:</div>
                                        <a class="dropdown-item" href="#">Action</a> <a
                                            class="dropdown-item" href="#">Another action</a>
                                        <div class="dropdown-divider"></div>
                                        <a class="dropdown-item" href="#">Something else here</a>
                                    </div>
                                </div>
                            </div>
                                <!-- Card Body -->
                                <div class="card-body">
                                    <div class="chart-pie pt-4 pb-2">
                                        <canvas id="myPieChart"></canvas>
                                    </div>
                                    <div class="mt-4 text-center small">
                                    <span class="mr-2"> <i
                                        class="fas fa-circle text-primary"></i> Present Employees
                                    </span> <span class="mr-2"> <i
                                        class="fas fa-circle text-success"></i> Absenties
                                    </span> <span class="mr-2"> <i class="fas fa-circle text-info"></i>
                                        Idle Time
                                    </span>
                                </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    </div>
                    <div class="row">

                        <!-- Area Chart -->
                        <div class="col-xl-8 col-lg-7"></div>

                        <!-- Pie Chart -->
                        <div class="col-xl-4 col-lg-5"></div>
                    </div>

                    <div class="col-xl-4 col-lg-5">
                        <div class="card shadow mb-4">
                            
                        </div>
                    </div>
                    
                </div>
                <!-- Content Row -->
                <div class="row ">


                    <!-- Project Card Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Projects</h6>
                        </div>
                        <div class="card-body">
                            <div class="scroll-container"
                                style="width: 100%; height: 300px; overflow: auto;">
                                <div class="scrollmenu" style="white-space: nowrap;">
                                    <table id="titleTable" class="table table-striped">
                                        <thead>
                                            <tr>
                                                <th>ID</th>
                                                <th>Title</th>
                                                <th>Current Duration</th>
                                                <th>Current Timer</th>
                                                <th>Last Duration</th>
                                                <th>Last Time</th>
                                                <th>Process Id</th>
                                                <th>User Id</th>
                                                <th>Process Name</th>
                                                <th>Last Modified Time</th>
                                                <th>Modification Date</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <!--                    </div> -->
                        <div class="col-lg-6 mb-4">


                            <!-- Approach -->
                            <!--                        <div class="card shadow mb-4"></div> -->
                        </div>
                    </div>
                </div>
            </div>

            <!-- Footer -->
            <footer class="sticky-footer bg-white">
                <div class="container my-auto">
                    <div class="copyright text-center my-auto">
                        <span>Copyright &copy; Your Website 2021</span>
                    </div>
                </div>
            </footer>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top"> <i
        class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
        aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button" data-dismiss="modal"
                        aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Select "Logout" below if you are ready
                    to end your current session.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button"
                        data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="login.jsp">Logout</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="/resources/assets/vendor/jquery/jquery.min.js"></script>
    <script
        src="/resources/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script
        src="/resources/assets/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="/resources/assets/js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="/resources/assets/vendor/chart.js/Chart.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="/resources/assets/js/demo/chart-area-demo.js"></script>
    <script src="/resources/assets/js/demo/chart-pie-demo.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    <script>
 let fetchedData; 

 fetch('/api/record') 
   .then(response => response.json())
   .then(data => {
     fetchedData = data; 
    
     if (fetchedData && fetchedData.length > 0) {
if (Array.isArray(fetchedData)) {
  const tableBody = document.getElementById('titleTable');
  fetchedData.forEach(item => {
    const itemId = item.id;
    const itemTitle = item.title;
    const itemCurrentDuration = item.currentDuration;
    const itemCurrentTimer = item.currentTimer;
    const itmeLastDuration = item.lastDuration;
    const itemLastModifiedTime = item.lastModifiedTime;
    const itemLastTime = item.lastTime;
    const itemModificationDate = item.modificationDate;
    const itemProcessId = item.processId;
    const itemProcessName = item.processName;
    const itemUserId = item.userId;
    
    const row = document.createElement('tr');
    
    const tdItemId = document.createElement('td');
    const linkItemId = document.createElement('a');
    linkItemId.href = "/api/charts";
    linkItemId.textContent = itemId;
    tdItemId.appendChild(linkItemId);
 
    const tdItemTitle = document.createElement('td');
    tdItemTitle.textContent = itemTitle;

    const tdItemCurrentDuration = document.createElement('td');
    tdItemCurrentDuration.textContent = itemCurrentDuration;
    
    const tdItemCurrentTimer = document.createElement('td');
    tdItemCurrentTimer.textContent = itemCurrentTimer;
    
    const tdItemLastDuration = document.createElement('td');
    tdItemLastDuration.textContent = itmeLastDuration;
    
    const tdItemLastModifiedTime = document.createElement('td');
    tdItemLastModifiedTime.textContent = itemLastModifiedTime;
    
    const tdItemLastTime = document.createElement('td');
    tdItemLastTime.textContent = itemLastTime;
    
    const tdItemModificationDate = document.createElement('td');
    tdItemModificationDate.textContent = itemModificationDate;
    
    const tdItemProcessId = document.createElement('td');
    tdItemProcessId.textContent = itemProcessId;
    
    const tdItemProcessName = document.createElement('td');
    tdItemProcessName.textContent = itemProcessName;
    
    const tdItemUserId = document.createElement('td');
    tdItemUserId.textContent = itemUserId;
    
    row.appendChild(tdItemId);
    row.appendChild(tdItemTitle);
    row.appendChild(tdItemCurrentDuration);
    row.appendChild(tdItemCurrentTimer);
    row.appendChild(tdItemLastDuration);
    row.appendChild(tdItemLastModifiedTime);
    row.appendChild(tdItemLastTime);
    row.appendChild(tdItemModificationDate);
    row.appendChild(tdItemProcessId);
    row.appendChild(tdItemProcessName);
    row.appendChild(tdItemUserId);
    
    tableBody.appendChild(row);
  });
}
          else {
           console.error('fetchedData is not an array or is empty.');
         }
     } else {
         const noDataMessage = document.createElement('tr');
         noDataMessage.innerHTML = `<td colspan="4">No data available</td>`;
         tableBody.appendChild(noDataMessage);
     }
     
   })
   .catch(error => {
     console.error('Error fetching data:', error);
   });
 
 document.addEventListener("DOMContentLoaded", function () {
     fetch('/api/record')
         .then(response => {
             if (!response.ok) {
                 throw new Error('Network response was not ok');
             }
             return response.json();
         })
         .then(data => {
             console.log('Fetched data:', data); 
             
             

            
         })
         .catch(error => {
             console.error('Error fetching data:', error); 
             
             const tableBody = document.querySelector('#titleTable tbody');
             const errorMessage = document.createElement('tr');
             errorMessage.innerHTML = `<td colspan="4">Error fetching data</td>`;
             tableBody.appendChild(errorMessage);
         });
 });

  </script>
    <script>
        document.addEventListener("DOMContentLoaded", function () {
            // Initialize Flatpickr date picker
            flatpickr("#datePicker", {
                mode: "range",
                dateFormat: "Y-m-d",
                altInput: true,
               // altFormat: "F j, Y",
            });


        });
    </script>

    <script>
    // Fetch data from the API
    fetch('/api/department')
        .then(response => response.json())
        .then(teams => {
            // Get the dropdown menu element
            const dropdownMenu = document.getElementById('teamDropdownMenu');
  console.log("------------",teams);
            // Loop through the teams and create dropdown items
            teams.forEach(team => {
                const dropdownItem = document.createElement('a');
                dropdownItem.classList.add('dropdown-item');
                dropdownItem.href = '#';
                dropdownItem.style.width = '195px';
                dropdownItem.style.textAlign = '-webkit-center';
                dropdownItem.textContent = team.name; // Assuming your API returns an object with a 'teamName' property

                // Add an event listener if you want to handle clicks on the dropdown items
                dropdownItem.addEventListener('click', () => {
                    // Handle the selection, e.g., update some state or trigger another action
                    console.log('Selected team:', team.name);
                });

                // Append the dropdown item to the dropdown menu
                dropdownMenu.appendChild(dropdownItem);
            });
        })
        .catch(error => {
            console.error('Error fetching teams:', error);
        });
</script>
 <script>
fetch('/api/activity')
    .then(response => response.json())
    .then(data => {
        console.log('datacheck for activity',data);
        const chartData = {
            labels: data.map(item => new Date(item.time).toLocaleString()),
            datasets: [{
                label: 'User IDs',
                data: data.map(item => item.userId),
                backgroundColor: 'rgba(54, 162, 235, 0.6)',
                borderColor: 'rgba(54, 162, 235, 1)',
                borderWidth: 1
            }]
        };

        const ctx = document.getElementById('myBarChart').getContext('2d');
        new Chart(ctx, {
            type: 'bar',
            data: chartData,
            options: {
                scales: {
                    x: {
                        type: 'time',
                        time: {
                            unit: 'minute'
                        },
                        title: {
                            display: true,
                            text: 'Time'
                        }
                    },
                    y: {
                        title: {
                            display: true,
                            text: 'User ID'
                        },
                        beginAtZero: true
                    }
                }
            }
        });
    })
    .catch(error => console.error('Error fetching data:', error));
</script>


</body>

</html>