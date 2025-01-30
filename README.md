# Software Quality Engineering - System Testing
This is a repository for the system-testing assignment of the Software Quality Engineering course at the [Ben-Gurion University](https://in.bgu.ac.il/), Israel.

## Assignment Description
In this assignment, we tested an open-source software called PrestaShop(https://demo.prestashop.com/#/en/front).

## Online Shopping Platform Description

The online shopping platform is a basic e-commerce website designed for both customers and administrators.

### For Customers:
- They can log in using a username and password.
- The platform offers a product catalog organized into categories, allowing customers to browse available items.
- Users can add products to their shopping cart for immediate purchase or save them to a "favorites" list for future consideration.
- Once ready, customers can proceed to checkout to place an order online.

### For Administrators:
- The platform includes a separate management interface to oversee the product catalog.
- Administrators can view all products available for sale, organized by categories.
- They can update product details such as descriptions, prices, stock quantities, and other information.
- This system provides tools to manage inventory effectively and ensure accurate product information is displayed to customers.

The website offers a comprehensive solution for online shopping and catalog management, suitable for a streamlined e-commerce experience. This description refers to a demo PrestaShop website used in the context of a software quality assurance course.


## Installation
In addition to the basic installations, which we completed by following the course team's guidelines, we also installed Docker Desktop. Using Docker Desktop, we successfully set up the websites we worked on locally.
### Docker Desktop Installation Instructions
If you need to install Docker Desktop, follow these steps:
1. **Download Docker Desktop**:
   - Visit the official [Docker website](https://www.docker.com/products/docker-desktop) and download the appropriate version for your operating system (Windows, macOS, or Linux).
2. **Install Docker Desktop**:
   - Run the downloaded installer and follow the on-screen instructions. Make sure to enable WSL integration if you're using Windows with WSL.
3. **Verify the Installation**:
   - After installation, open Docker Desktop and ensure it runs correctly.
   - Test the installation by opening a terminal and running the command:
     ```bash
     docker --version
     ```
     You should see the installed version of Docker.

We followed these steps to ensure our local environment was properly configured to work with the provided project files. For further guidance, refer to Docker's official documentation.

## What we tested
### User Story 1: Adding Products to Wishlist with Quantity `x`
**Preconditions:**
- The user is signed in to the customer website.
- The chosen product exists in the catalog.
- The chosen product has not been added to the wishlist before.

**Expected Outcome:**
- The product is added to the wishlist with the specified quantity (`x`).

---

### User Story 2: Admin Changes the Quantity of a Product to Less Than `x`
**Preconditions:**
- The admin is signed in to the admin's website.
- The chosen product exists in the catalog.

**Expected Outcome:**
- The product quantity is updated to the new quantity inputted by the admin.


## How we tested
We used two different testing methods:
1. [Cucumber](https://cucumber.io/), a behavior-driven testing framework.
2. [Provengo](https://provengo.tech/), a story-based testing framework.

Each of the testing methods is elaborated in its own directory. 

## Results
Update all README.md files (except for d-e, see Section 1). Specifically, replace all $$*TODO*…$$ according to the instructions inside the $$.

